class Solution {
    public void duplicateZeros(int[] arr) {
        int m = arr.length, x = 0, y = 0;

        int[] nums = new int[m];

        for (int i = 0; i < m; i++) nums[i] = arr[i];

        int j = 0, k = 0;
        while (j < m) {
            if (nums[k] == 0) {
                arr[j++] = 0;
                if (j < m) arr[j] = 0;
            } else arr[j] = nums[k];

            j++;
            k++;
        } 
    }
}
