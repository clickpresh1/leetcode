class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for (int i = k; i < n - k + 1; i++) {
            int y = i;
            int x = i - 1;
            int kCount = k - 1;
            int sum = 1;
            
            while (kCount > 0) {
                if ((nums.get(x) > nums.get(x - 1)) && (nums.get(y) < nums.get(y + 1))) {
                    sum += 1;
                    x -= 1;
                    y += 1;
                    kCount -= 1;
                } else break;
            } 

            if (sum == k) return true;
        } 

        return false;
    }
}
