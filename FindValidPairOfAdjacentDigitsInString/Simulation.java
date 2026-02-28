class Solution {
    public String findValidPair(String s) {
        int m = s.length();
        char[] arr = s.toCharArray();
        int[] map = new int[10];

        for (char c : arr) map[c - '0']++;

        int pre = arr[0] - '0';
        for (int i = 1; i < m; i++) {
            int cur = arr[i] - '0';

            if (cur == pre) continue;

            if ((map[cur] == cur) && (map[pre] == pre)) return new String(arr, i - 1, 2);

            pre = cur;
        }

        return "";
    }
}
