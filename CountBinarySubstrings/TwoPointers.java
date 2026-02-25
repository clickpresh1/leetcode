class Solution {
    public int countBinarySubstrings(String s) {
        int m = s.length(), cnt = 0, cnt1 = 0;
        char[] arr = s.toCharArray();
        char c = arr[0];

        int i = 0;
        while (i < m) {
            int u = i, cnt2 = 1;

            while ((++u < m) && (arr[u] == c)) cnt2++;

            c ^= 1;

            cnt += Math.min(cnt1, cnt2);

            cnt1 = cnt2;

            i = u;
        } 

        return cnt;
    }
}
