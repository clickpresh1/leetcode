class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int m = nums.length, count = 0;

        for (int i = 0; i < m; i++) {
            if (nums[i] % k != 0) continue;

            int g = nums[i];

            if (g == k) count++;

            for (int j = i + 1; j < m; j++) {
                if (g != nums[j]) g = gcd(g, nums[j]);

                if (g == k) count++;
                if (g < k) break;
            } 
        } 

        return count;
    } 

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } 

        return a;
    }
}
