class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int m = aliceSizes.length, n = bobSizes.length;

        int sumA = 0, sumB = 0;

        for (int item : aliceSizes) sumA += item;
        for (int item : bobSizes) sumB += item;

        int sum = sumA + sumB, target = sum / 2;

        for (int a : aliceSizes) {
            int k = target - sumA + a;
            k = ((sumB - sumA) / 2) + a; //simplify target and sumA;
            for (int b : bobSizes) {
                if (k == b) return new int[] {a, b};
            }
        } 

        return new int[2];
    } 
} 
