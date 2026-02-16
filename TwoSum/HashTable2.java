class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int f = nums[i], d = target - f;

            if (map.containsKey(d)) return new int[] {i, map.get(d)};
            else map.put(f, i); 
        } 

        return new int[] {};
    }
}
