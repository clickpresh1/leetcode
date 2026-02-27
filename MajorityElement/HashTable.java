class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length, thresh = (int) (m / 2);
        Map<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            map.put(item, map.getOrDefault(item, 0) + 1);

            if (map.get(item) > thresh) return item;
        } 

        return 0;
    }
}
