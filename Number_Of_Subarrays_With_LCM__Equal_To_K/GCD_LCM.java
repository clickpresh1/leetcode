class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int m = nums.length, count = 0;

        for (int i = 0; i < m; i++) {
            int l = nums[i];
            if (l > k) continue;
            if (l == k) count++;

            for (int j = i + 1; j < m; j++) {
                l = lcm(l, nums[j]);

                if (l > k) break;
                if (l == k) count++;
            }
        } 

        return count;
    } 

    public static int lcm(int a, int b) {
        int x = a, y = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } 

        return x * (y / a);
    }
}
