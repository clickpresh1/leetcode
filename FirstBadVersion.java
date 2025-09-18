/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int val = 1;
        int high = n;
        int low = 1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (isBadVersion(mid)) {
                val = mid;
                high = mid - 1;
            } else if (!(isBadVersion(mid))) {
                low = mid + 1;
            }
        } 

        return val;
    }
}
