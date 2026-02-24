class Solution {
    public int hIndex(int[] citations) {
        int m = citations.length;
        int x = 0, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);
            int cite = citations[mid], cnt = m - mid;

            if (cite == cnt) return cnt;
            else if (cite < cnt) x = mid + 1;
            else y = mid - 1;
        } 

        return m - x;
    }
}
