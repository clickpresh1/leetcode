// DRAFT
// DRAFT
// DRAFT


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int val = 0;
        int high = n;
        int low = 1;
        while (true) {
            int mid = low + ((high - low) / 2);
            if (!(isBadVersion(mid - 1)) && (isBadVersion(mid))) {
                val = mid;
                break;
            } else if ((isBadVersion(mid - 1)) && (isBadVersion(mid))) {
                high = mid - 1;
            } else if ((!(isBadVersion(mid - 1))) && (!(isBadVersion(mid)))) {
                low = mid + 1;
            } 

            // if (isBadVersion(mid)) {
            //     high = mid - 1;
            // } else if (!(isBadVersion(mid))) {
            //     low = mid + 1;
            // }


        } 

        return val;
    }
}
