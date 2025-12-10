class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int m = nums.length;
        Set<Integer> setLeft = new HashSet<>(), setRight = new HashSet<>();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) setLeft.add(nums[j]);

            for (int j = m - 1; j > i; j--) setRight.add(nums[j]);

            arr[i] = setLeft.size() - setRight.size();

            setRight.clear();
        } 

        arr[m - 1] = setLeft.size();

        return arr;
    }
}
