class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for (Integer i : nums) {
            if (i == 0) freq[0] += 1;
            else if (i == 1) freq[1] += 1;
            else freq[2] += 1;
        } 

        for (int i = 0; i < freq[0]; i++) {
            nums[i] = 0;
        } 

        for (int i = freq[0]; i < freq[0] + freq[1]; i++) {
            nums[i] = 1;
        } 

        for (int i = freq[0] + freq[1]; i < freq[0] + freq[1] + freq[2]; i++) {
            nums[i] = 2;
        }
    }
}
