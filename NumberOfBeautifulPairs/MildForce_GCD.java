class Solution {
    public int countBeautifulPairs(int[] nums) {
        int m = nums.length, cnt = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int f = first(nums[i]), l = last(nums[j]);
                if (gcd(f, l) == 1) cnt++;
            }
        } 

        return cnt;
    } 

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } 
        
        return a;
    } 

    public static int first(int a) {
        if (a < 10) return a;
        else if (a < 100) return a / 10;
        else if (a < 1000) return a / 100;
        else return a / 1000;
    } 

    public static int last(int b) {
        
        return b % 10;
    }
}
