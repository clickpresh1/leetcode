class Solution {
    public String largestNumber(int[] nums) {
        int m = nums.length;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                int u = nums[j], v = nums[j + 1];
                if (uGreaterV(u, v)) {
                    int temp = u;
                    nums[j] = v;
                    nums[j + 1] = temp;
                } 
            } 

            if (nums[m - 1] == 0) return "0";

            sb.append(nums[m - 1 - i]);
        } 

        return sb.toString();
    } 

    public static boolean uGreaterV(int a, int b) {
        long m = tens(a), n = tens(b);

        long x = (a * n) + b, y = (b * m) + a;

        return (x > y);
    } 

    public static int tens(int a) {
        if (a < 10) return 10;
        else if (a < 100) return 100;
        else if (a < 1000) return 1000;
        else if (a < 10000) return 10000;
        else if (a < 100000) return 100000;
        else if (a < 1000000) return 1000000;
        else if (a < 10000000) return 10000000;
        else if (a < 100000000) return 100000000;
        else if (a < 1000000000) return 1000000000;
        else return 10;
    } 
}
