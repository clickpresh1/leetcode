class Solution {
    public int passThePillow(int n, int time) {
        int num = (n - 1) * 2;

        int k = time % num;

        return (k >= n) ? (n * 2) - (k + 1) : ++k;
    }
}
