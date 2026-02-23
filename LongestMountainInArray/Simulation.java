
class Solution {
    public int longestMountain(int[] arr) {
        int m = arr.length, mx = 0, i = 1;

        while (i < m - 1) {
            if ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])) {
                int x = i;
                while ((--x >= 0) && (arr[x] < arr[x + 1])) {}

                if (i - x - 1 == 0) {i++; continue;} 

                int y = i;
                while ((++y < m) && (arr[y] < arr[y - 1])) {}

                if(y - i - 1 == 0) {i++; continue;}

                int len = y - x - 1;

                if (len > mx) mx = len;

                i = y;
            } else i++;
        } 

        return mx;
    } 
}
