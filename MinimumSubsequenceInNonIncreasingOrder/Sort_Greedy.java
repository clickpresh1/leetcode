class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int m = nums.length, sum = 0;

        for (int i = 0; i < m; i++) sum += nums[i];

        int partialSum = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < m - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            } 

            partialSum += nums[i];
            list.add(nums[i]);

            if (partialSum > (sum - partialSum)) break;
        } 

        return list;
    }
}
