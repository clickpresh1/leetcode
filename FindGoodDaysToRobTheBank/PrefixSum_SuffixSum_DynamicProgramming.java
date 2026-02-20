class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int m = security.length;
        List<Integer> list = new ArrayList<>();

        if (time == 0) {
            for (int i = 0; i < m; i++) list.add(i);

            return list;
        }
        int[] pre = new int[m], post = new int[m];

        int prePrev = 0, postNext = 0;
        for (int i = 0; i < m - 1; i++) {
            if (security[i] < security[i + 1]) pre[i] = 1;

            pre[i] += prePrev;
            prePrev = pre[i];
        } 

        pre[m - 1] += prePrev;

        for (int i = m - 1; i > 0; i--) {
            if (security[i] < security[i - 1]) post[i] = 1;

            post[i] += postNext;
            postNext = post[i];
        } 

        post[0] += postNext;

        for (int i = time; i < m - time; i++) {
            int y = i - 1, x = i - time - 1;
            int b = (y >= 0) ? pre[y] : 0;
            int a = (x >= 0) ? pre[x] : 0;

            if (b - a != 0) continue;

            y = i + time + 1; x = i + 1;
            b = (y < m) ? post[y] : 0;
            a = (x < m) ? post[x] : 0;

            if (b - a == 0) list.add(i);
        } 

        return list;
    }
}
