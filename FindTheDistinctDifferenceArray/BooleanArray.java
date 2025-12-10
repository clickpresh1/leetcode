class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int m = nums.length;
        boolean[] booLeft = new boolean[51], booRight = new boolean[51];
        int[] arr = new int[m];

        int countLeft = 0, countRight = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                if (!booLeft[nums[j]]) {
                    booLeft[nums[j]] = true;
                    countLeft++;
                }
            } 

            for (int j = m - 1; j > i; j--) {
                if (!booRight[nums[j]]) {
                    booRight[nums[j]] = true;
                    countRight++;
                }
            } 

            arr[i] = countLeft - countRight;

            Arrays.fill(booRight, false);
            countRight = 0;
        } 

        arr[m - 1] = countLeft;

        return arr;
    }
}
