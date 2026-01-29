class Solution {
    public int distinctAverages(int[] nums) {
        int m = nums.length;
        int[] freq = new int[101], sums = new int[201];
        
        for (int i = 0; i < m; i++) freq[nums[i]]++;

        for (int i = 0, j = 0; i < 101; i++) {
            while (freq[i]-- > 0) nums[j++] = i;
        } 

        int x = 0, y = m - 1, count = 0; 
        while (x < y) {
            int z = nums[x] + nums[y];
            sums[z]++;

            if (sums[z] == 1) count++;

            x++; y--;
        } 

        return count;
    } 
}
