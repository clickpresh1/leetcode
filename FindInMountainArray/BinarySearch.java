/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int m = mountainArr.length();

        int x = 0, y = m - 1, middle = -1;
        while (x <= y) {
            int mid = x + ((y - x) / 2);
            int f = mountainArr.get(mid);

            if (mid == 0) x = mid + 1;
            else if (mid == m - 1) y = mid - 1;
            else {
                int e = mountainArr.get(mid - 1), g = mountainArr.get(mid + 1);
                if ((f > e) && (f > g)) {
                    middle = mid;
                    break;
                } else if (f < e) y = mid - 1;
                else x = mid + 1;
            }
        } 

        int a = 0, b = middle, indx = -1;
        while (a <= b) {
            int mid1 = a + ((b - a) / 2);
            int f = mountainArr.get(mid1); 

            if (f == target) return mid1;
            else if (f < target) a = mid1 + 1;
            else b = mid1 - 1;
        } 

        int c = middle + 1, d = m - 1;
        while (c <= d) {
            int mid2 = c + ((d - c) / 2);
            int f = mountainArr.get(mid2);

            if (f == target) return mid2;
            else if (f < target) d = mid2 - 1;
            else c = mid2 + 1;
        } 

        return -1;
    }
}
