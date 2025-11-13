class Solution {
    public int[] resultArray(int[] nums) {
        int[] p = new int[nums.length];
        int[] q = new int[nums.length];
        int[] result = new int[nums.length];

        p[0] = nums[0];
        q[0] = nums[1];
        int P = 0;
        int Q = 0;
        for (int i = 2; i < nums.length; i++) {
            if (p[P] > q[Q]) {
                p[P + 1] = nums[i];
                P += 1;
            } else if (p[P] < q[Q]) { 
                q[Q + 1] = nums[i];
                Q += 1;
            }
        } 

        int k = 0;
        for (int i = 0; i <= P; i++) {
            if (p[i] != 0) {
                result[i] = p[i];
                k += 1;
            } else break;

        } 

        for (int i = 0; i <= Q; i++) {
            if (q[i] != 0) {
                result[k + i] = q[i];
            } else break;
        } 

        return result;
    }
}
