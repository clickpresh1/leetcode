class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 0;
        while (++i < n) {
            if ((noZ(i)) && (noZ(n - i))) return new int[] {i, n - i};
        } 

        return new int[] {1, 1};
    } 

    public static boolean noZ(int b) {
        while (b != 0) {
            if (b % 10 == 0) return false;

            b /= 10;
        } 

        return true;
    }
}
