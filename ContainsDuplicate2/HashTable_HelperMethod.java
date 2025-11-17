class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            } else {
                map.get(nums[i]).add(i);
            }
        } 

        for (Integer a : map.keySet()) {
            if (map.get(a).size() > 1) {
                if (check(map.get(a), k)) {
                    return true;
                }
            }
        } 

        return false;
    } 

    public static boolean check(List<Integer> list, int k) {
        int x = 0;
        int y = x + 1;
        
        while (x < list.size() - 1) {
            while (y < list.size()) {
                if (Math.abs(list.get(y) - list.get(x)) <= k) {
                    return true;
                } 
                y += 1;
            } 

            x += 1;
            y = x + 1;
        } 

        return false;
    }
}
