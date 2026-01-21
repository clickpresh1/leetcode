class Solution {
    public int findGCD(int[] nums) {
        int mx = Integer.MIN_VALUE, mn = Integer.MAX_VALUE; 

        for (int item : nums) {
            if (item < mn) mn = item;
            if (item > mx) mx = item;
        } 

        while (mx != 0) {
            int temp = mx;
            mx = mn % mx;
            mn = temp;
        } 

        return mn;
    }
}
