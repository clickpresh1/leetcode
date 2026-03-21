class Solution {
    public int minimumRounds(int[] tasks) {
        int m = tasks.length, cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int f = tasks[i], g = map.getOrDefault(f, 0);

            map.put(f, ++g);
        } 

        for (int val : map.values()) {
            int f = (val == 1) ? 0 : (val + 2) / 3;

            if (f == 0) return -1;

            cnt += f;
        }

        return cnt;
    } 
}
