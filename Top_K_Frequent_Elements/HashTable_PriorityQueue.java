class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : nums) {
            if (!(map.containsKey(item))) map.put(item, 1);
            else {
                int val = map.get(item);
                map.put(item, val + 1);
            } 
        } 

        Queue<Integer> q = new PriorityQueue<>((x, y) -> (map.get(y) - map.get(x)));
        for (int key : map.keySet()) {
            q.add(key);
        } 

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll();
        } 

        return res;
    } 
}
