class Solution {
    public int rob(int[] nums) {
        return rob(nums, 0, new HashMap<>());
    } 

    public int rob(int[] nums, int i, HashMap<Integer, Integer> hashMap) {
        if (i >= nums.length) return 0;

        if (hashMap.containsKey(i)) return hashMap.get(i);

        int result = Math.max((nums[i] + rob(nums, i + 2, hashMap)), (rob(nums, i + 1, hashMap))); 
        hashMap.put(i, result);

        return result;
    }
}
