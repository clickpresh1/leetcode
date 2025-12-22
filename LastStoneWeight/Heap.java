class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

        for (int item : stones) q.add(item);

        while (q.size() > 1) {
            int max = q.poll(), max2 = q.poll();

            if (max != max2) q.add(max - max2);
        } 

        return (!q.isEmpty()) ? q.poll() : 0;
    }
}
