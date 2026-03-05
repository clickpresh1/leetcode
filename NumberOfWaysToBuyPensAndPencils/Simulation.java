class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long cnt = 0;

        if (cost1 < cost2) {
            int temp = cost1;
            cost1 = cost2;
            cost2 = temp;
        } 
        
        int f = total / cost1;

        for (int i = 0; i < f + 1; i++) {
            int a = (total - (i * cost1)) / cost2;

            cnt += ++a;
        } 

        return cnt;
    }
}
