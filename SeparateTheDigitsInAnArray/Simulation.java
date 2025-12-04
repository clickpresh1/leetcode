class Solution {
    public int[] separateDigits(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            while (k > 0) {
                count++;
                k /= 10;
            } 
        } 

        int[] arr = new int[count];

        for (int i = nums.length - 1; i >= 0; i--) {
            int k = nums[i];
            while (k > 0) {
                arr[--count] = k % 10;
                k /= 10;
            }
        } 

        return arr;
    }
}
