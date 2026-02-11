class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int m = nums.size(), cnt = 0;

        boolean[] boo = new boolean[k];

        for (int i = m - 1; i >= 0; i--) {
            int item = nums.get(i);

            if ((item <= k) && (!boo[item - 1])) {
                boo[item - 1] = true;
                cnt++;
            } 

            if (cnt == k) return m - i;
        } 

        return m;
    }
}
