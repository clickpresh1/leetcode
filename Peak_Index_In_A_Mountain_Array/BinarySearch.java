class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m = arr.length, x = 0, y = m - 1;
        
        while (x <= y) {
            int mid = x + ((y - x) / 2), f = arr[mid];

            if (mid == 0) x = mid + 1;
            else if (mid == m - 1) y = mid - 1;
            else {
                if ((f > arr[mid - 1]) && (f > arr[mid + 1])) return mid;
                else if (f < arr[mid - 1]) y = mid - 1;
                else if (f < arr[mid + 1]) x = mid + 1;
            }
        } 

        return 0;
    }
}
