class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int m = nums.size();
        long bitmask = 0;

        for (int i = 1; i < k + 1; i++) bitmask |= (1L << i);

        long b = 0;

        for (int i = m - 1; i >= 0; i--) {
            int item = nums.get(i);

            if (item <= k) {
                if ((b & (1L << item)) == 0) b |= (1L << item);

                if (bitmask == b) return m - i;
            } 
        } 

        return m;
    }
}
