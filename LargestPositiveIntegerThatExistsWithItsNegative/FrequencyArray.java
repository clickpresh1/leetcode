class Solution {
    public int findMaxK(int[] nums) {
        int m = nums.length, mx = -2000;

        int[] freqPos = new int[1001], freqNeg = new int[1001];

        for (int item : nums) {
            if (item >= 0) freqPos[item]++;
            else freqNeg[-item]++;

            if (item > mx) mx = item;
        } 

        while (mx > 0) {
            if ((freqPos[mx] > 0) && (freqNeg[mx] > 0)) return mx;

            mx--;
        }

        return -1;
    }
}
