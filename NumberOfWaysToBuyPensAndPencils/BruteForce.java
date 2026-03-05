class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long cnt = 0;
        int f = total / cost1, g = total / cost2;

        if (total >= cost1) {
            if (total >= cost2) {
                for (int i = 0; i < f + 1; i++) {
                    int a = (total - (i * cost1)) / cost2;

                    cnt += ++a;
                }
            } else cnt += ++f;
        } else {
            if (total >= cost2) cnt += ++g; 
            else cnt++;
        } 

        return cnt;
    }
}
