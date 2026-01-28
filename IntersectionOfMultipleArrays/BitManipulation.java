class Solution {
    public List<Integer> intersection(int[][] nums) {
        int m = nums.length, n = nums[0].length, bitmaskPower = 1;
        List<Integer> list = new ArrayList<>();

        int[] bitmaskArr = new int[10001];

        int mx = 0, mn = 1001, totalBitmask = 0;
        for (int item : nums[0]) {
            bitmaskArr[item] |= bitmaskPower;

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        } 

        totalBitmask |= 1;

        int k = 1;

        while (k < m) {
            bitmaskPower *= 2;
            for (int item : nums[k++]) bitmaskArr[item] |= bitmaskPower;

            totalBitmask |= bitmaskPower;
        } 

        for (int i = mn; i <= mx; i++) {
            if (bitmaskArr[i] == totalBitmask) list.add(i);
        } 

        return list;
    }
}
