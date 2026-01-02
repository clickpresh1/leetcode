class Solution {
    public int balancedStringSplit(String s) {
        int x = 0, y = 0, count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') x++;
            if (c == 'R') y++;

            if (x == y) {
                count++;
                x = 0;
                y = 0;
            } 
        } 

        return count;
    }
}
