/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int x = 1, y = n;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (isBadVersion(mid)) y = mid - 1;
            else x = mid + 1;
        } 

        return x;
    }
}
