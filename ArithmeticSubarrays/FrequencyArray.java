class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m = nums.length, n = l.length;
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(isArith(nums, l[i], r[i]));
        } 

        return list; 
    } 

    public static boolean isArith(int[] a, int x, int y) {
        int m = y - x + 1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE; 

        int[] freq = new int[m];

        for (int i = x; i <= y; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        } 

        if (max == min) return true;

        if (((max - min) % (m - 1)) != 0) return false;

        int commDiff = (max - min) / (m - 1);

        for (int i = x; i <= y; i++) {
            int k = a[i] - min;
            if ((k % commDiff != 0) || ((k / commDiff) > m)) return false;
            freq[k / commDiff]++;
            if (freq[k / commDiff] > 1) return false;
        } 

        return true;
    }
}
