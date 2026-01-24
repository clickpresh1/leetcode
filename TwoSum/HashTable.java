class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m = nums.length, a = -1, b = -1;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                b = i; a = map.get(diff); return new int[] {a, b};
            } else {
                map.put(nums[i], i);
            } 
        } 

        return new int[] {};
    }
}
