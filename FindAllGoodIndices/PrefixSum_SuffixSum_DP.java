class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int m = nums.length, pointer = 0;
        List<Integer> list = new ArrayList<>();
        int[] pre = new int[m], post = new int[m], arr = new int[m];

        for (int i = 2; i < m - 1; i++) {
            if (nums[i - 2] < nums[i - 1]) pre[i] = 1; 

            pre[i] += pre[i - 1];
        } 

        pre[m - 1] = pre[m - 2];

        for (int i = m - 3; i > 0; i--) {
            if (nums[i + 2] < nums[i + 1]) post[i] = 1; 

            post[i] += post[i + 1];
        } 

        post[0] = post[1];

        for (int i = k; i < m - k; i++) {
            if (pre[i] - pre[i - k + 1] != 0) continue;

            if (post[i] - post[i + k - 1] == 0) arr[pointer++] = i;
        } 

        for (int i = 0; i < pointer; i++) list.add(arr[i]);

        return list;
    }
}
