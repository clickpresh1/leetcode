class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int m = nums.length, mx = -100000, mn = 100000;
        int[] map1 = new int[10001], map2 = new int[10001];

        for (int item : nums) {
            if (item >= 0) map1[item]++;
            else map2[item + 10000]++;

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        }

        Queue<Integer> q = new PriorityQueue<>((x, y) -> {
            int X = (x >= 0) ? map1[x] : map2[x + 10000];
            int Y = (y >= 0) ? map1[y] : map2[y + 10000];
            return Y - X;
        });

        if (mx >= 0) {
            for (int i = 0; i < mx + 1; i++) {
                if (map1[i] != 0) q.add(i);
            } 
        }

        if (mn < 0) {
            for (int i = mn + 10000; i < 10001; i++) {
                if (map2[i] != 0) q.add(i - 10000);
            } 
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) res[i] = q.poll();

        return res;
    } 
}
