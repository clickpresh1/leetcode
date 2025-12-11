class Solution {
    public int largestInteger(int num) {
        Queue<Integer> qEven = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> qOdd = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> list = new ArrayList<>();

        int k = num;

        while (k > 0) {
            int t = k % 10;
            if (t % 2 == 0) {
                qEven.add(t);
                list.add(0);
            } else {
                qOdd.add(t);
                list.add(1);
            } 

            k /= 10;
        } 

        int count = list.size(), res = 0;

        for (int i = 0; i < count; i++) {
            if (list.get(count - 1 - i) == 0) {
                res = (res * 10) + qEven.poll();
            } else {
                res = (res * 10) + qOdd.poll();
            }
        } 

        return res;
    }
}
