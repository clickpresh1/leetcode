class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int onesAndZeros = numOnes + numZeros;

        if (k <= numOnes) return k;
        else if (k <= onesAndZeros) return numOnes;
        else return numOnes - (k - onesAndZeros);
    }
}
