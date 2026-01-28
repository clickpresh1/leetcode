class Solution {
    public List<Integer> intersection(int[][] nums) {
        int m = nums.length, n = nums[0].length;
        List<Integer> list = new ArrayList<>();

        int[] freq = new int[1001];

        int mx = 0, mn = 1001;
        for (int item : nums[0]) {
            freq[item]++;

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        } 

        int k = 1;
        while (k < m) {
            for (int item : nums[k++]) freq[item]++;
        } 

        for (int i = mn; i <= mx; i++) {
            if (freq[i] == m) list.add(i);
        } 

        return list;
    }
}
