class Solution {
    public boolean judgeSquareSum(int c) {
        long L = 0;
        long R = (long) Math.sqrt(c);

        while (L <= R) {
            if (((L * L) + (R * R)) == c) {
                return true;
            } else if (((L * L) + (R * R)) > c) {
                R -= 1;
            } else {
                L += 1;
            }
        }
        
        return false;
    }
}
