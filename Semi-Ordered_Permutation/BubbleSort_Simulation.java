class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int m = nums.length, count = 0, i0 = -1, iM_1 = -1;

        if ((nums[0] == 1) && (nums[m - 1] == m)) return 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    if ((nums[j] == 1) || (nums[j + 1] == m)) count++;
                } 

                if (nums[j] == 1) i0 = j;
                if (nums[j + 1] == 1) i0 = j + 1;
                if (nums[j] == m) iM_1 = j;
                if (nums[j + 1] == m) iM_1 = j + 1;

                if ((i0 == 1) && (iM_1 != -1)) return count + m - iM_1;

                if ((iM_1 == m - 1) && (i0 != -1)) return count + i0;

                if ((nums[0] == 1) && (nums[m - 1] == m)) return count;
            }
        } 

        return count;
    }
}
