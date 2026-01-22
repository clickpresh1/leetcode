class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    int k = (i * i) + (j * j);
                    
                    if (sqrtInt(k) <= n) count++;
                }
            }
        } 

        return count;
    } 

    public static int sqrtInt(int a) {
        int x = 1, y = a / 2;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (mid * mid == a) return mid;
            else if (mid * mid < a) x = mid + 1;
            else y = mid - 1;
        } 

        return Integer.MAX_VALUE;
    } 
}
