class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int m = nums.length;
        int[] indx = new int[m];
        
        for (int i = 0; i < m; i++) indx[i] = i;

        Queue<Integer> q = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if (nums[indx[j]] > nums[indx[j + 1]]) {
                    int temp = indx[j];
                    indx[j] = indx[j + 1];
                    indx[j + 1] = temp;
                }
            } 

            q.add(indx[m - 1 - i]);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = nums[q.poll()];
        } 

        return res;
    }
}
