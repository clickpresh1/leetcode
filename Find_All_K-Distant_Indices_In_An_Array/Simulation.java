class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int m = nums.length, upperBound = -1;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (nums[i] == key) {
                int x = (i >= k) ? (i - k) : 0;
                if (x <= upperBound) x = upperBound + 1;

                int y = (i + k < m) ? (i + k) : m - 1;
                upperBound = y;

                while (x <= y) list.add(x++);
            }
        } 

        return list;
    }
}
