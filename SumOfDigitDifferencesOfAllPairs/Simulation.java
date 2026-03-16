class Solution {
    public long sumDigitDifferences(int[] nums) {
        int m = nums.length;
        long cnt = 0;

        int g = nums[0];
        while (g != 0) {
            int[] map = new int[10];

            int variety = 0;
            for (int i = 0; i < m; i++) {
                int u = nums[i] % 10;

                map[u]++;

                if (map[u] == 1) variety++;

                nums[i] /= 10;
            } 

            if (variety == 1) {
                g /= 10;
                continue;
            }

            long lcCnt = 0;
            for (int i = 0; i < 10; i++) {
                long u = map[i];

                if (u == 0) continue;

                for (int j = i + 1; j < 10; j++) {
                    long v = map[j];

                    if (v == 0) continue;
                    
                    lcCnt += u * v;
                }
            } 

            cnt += lcCnt;

            g /= 10;
        } 

        return cnt;
    } 
}
