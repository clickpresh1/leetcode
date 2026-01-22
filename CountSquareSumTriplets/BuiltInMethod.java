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
        int res = (int) Math.sqrt(a);

        return ((res * res) == a) ? res : Integer.MAX_VALUE;
    }
}
