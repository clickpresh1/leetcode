class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] map = new int[10001], stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            int item = nums2[i];

            while ((top > - 1) && (item > stack[top])) {
                int f = stack[top--];

                map[f] = item + 1;
            }

            stack[++top] = item;
        } 

        for (int i = 0; i < m; i++) {
            int f = map[nums1[i]] - 1;
            
            nums1[i] = (f > 0) ? f : - 1; 
        } 

        return nums1;
    }
}
