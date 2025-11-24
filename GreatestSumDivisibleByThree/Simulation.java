class Solution {
    public int maxSumDivThree(int[] nums) {
        int T = 0;
        for (int i = 0; i < nums.length; i++) {
            T += nums[i];
        } 

        int m = T % 3;

        if (m == 0) return T;

        int mv1 = T;
        int mv2 = T;
        int mv3 = T;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) continue;
            else {
                if (nums[i] % 3 == m) {
                    mv1 = Math.min(mv1, nums[i]);
                } else {
                    if (nums[i] <= mv2) {
                        mv3 = mv2;
                        mv2 = nums[i];
                    } else if ((nums[i] < mv3) && (nums[i] > mv2)) {
                        mv3 = nums[i];
                    }
                }
            }
        } 

        return Math.max(T - mv1, T - (mv2 + mv3));
    }
}
