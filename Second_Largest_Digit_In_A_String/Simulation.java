class Solution {
    public int secondHighest(String s) {
        int max1 = -1, max2 = -1;

        for (char c : s.toCharArray()) {
            int d = c - '0';
            
            if ((d >= 0) && (d <= 9)) {
                if (d > max1) {max2 = max1; max1 = d;}
                else if ((max1 > d) && (d > max2)) max2 = d;
            } 
        } 

        return max2;
    }
}
