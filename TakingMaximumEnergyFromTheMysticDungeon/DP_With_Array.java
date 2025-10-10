class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int m = energy.length;
        int[] sumArr = new int[m];
        int sumArrMax = Integer.MIN_VALUE;

        for (int i = m - 1; i >= 0; i--) {
            if (i + k >= m) {
                sumArr[i] = energy[i];
            } else {
                sumArr[i] = energy[i] + sumArr[i + k];
            } 

            sumArrMax = Math.max(sumArrMax, sumArr[i]);
        } 

        return sumArrMax;
    }
}
