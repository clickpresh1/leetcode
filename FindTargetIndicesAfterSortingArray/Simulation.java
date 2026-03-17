class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int m = nums.length, cntSmaller = 0, cntTarget = 0;
        List<Integer> list = new ArrayList<>();

        for (int item : nums) {
            if (item < target) cntSmaller++;
            else if (item == target) cntTarget++;
        } 

        cntTarget += cntSmaller;
        for (int i = cntSmaller; i < cntTarget; i++) list.add(i);

        return list;
    }
}
