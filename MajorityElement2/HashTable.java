class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if ((list.contains(nums[i]))) continue;

            if (map.containsKey(nums[i])) {
                int val = 1 + map.get(nums[i]);
                if (val > (nums.length / 3)) {
                    list.add(nums[i]);
                } else {
                    map.put(nums[i], val);
                }
                
            } else {
                int val = 1;
                if (val > (nums.length / 3)) {
                    list.add(nums[i]);
                } else {
                    val = 1;
                    map.put(nums[i], val);
                }
            }
        } 

        return list;
    }
}
