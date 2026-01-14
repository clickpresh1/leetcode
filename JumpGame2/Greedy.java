class Solution {
    public int jump(int[] nums) {
        int m = nums.length, currEnd = 0, newEnd = 0, jumps = 0;

        if (m == 1) return 0;

        for (int i = 0; i < m; i++) {
            if (i + nums[i] > newEnd) newEnd = i + nums[i];

            if (i == currEnd) {
                currEnd = newEnd;
                jumps++;

                if (currEnd >= (m - 1)) return jumps;
            } 
        } 

        return 0;
    }
}
