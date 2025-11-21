class NumArray {
    private int[] nums;
    private int[] R;

    public NumArray(int[] nums) {
        this.nums = nums;

        R = new int[nums.length + 1];

        R[nums.length] = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            R[i] = R[i + 1] + nums[i];
        } 
    }
    
    public int sumRange(int left, int right) {
        
        return R[left] - R[right + 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
