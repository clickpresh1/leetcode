class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int q = s.charAt(i) - 'a' + 1;
            sum += (q % 10) + (q / 10);

        } 

        k--;

        while (k > 0) {
            int x = sum; 
            sum = 0;

            while (x != 0) {
                sum += (x % 10);
                x /= 10;
            } 

            k--;
        }

        return sum;
    }
}
