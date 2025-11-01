class Solution {
    public int smallestNumber(int n) {

        int i = 0;
        while (true) {
            int x = 1 << i;
            if ((x > n)) return x - 1;

            i += 1;
        }
    }
}
