class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length, majElem = nums[0], cnt = 0;

        for (int item : nums) {
            if (cnt == 0) majElem = item;

            cnt += (item == majElem) ? 1 : -1;
        } 

        return majElem;
    }
}
