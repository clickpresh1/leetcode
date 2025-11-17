class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            } else {
                if (Math.abs(i - (map.get(nums[i]).get(map.get(nums[i]).size() - 1))) <= k) {
                    return true;
                } 

                map.get(nums[i]).add(i);
            }
        } 

        return false;
    } 
}
