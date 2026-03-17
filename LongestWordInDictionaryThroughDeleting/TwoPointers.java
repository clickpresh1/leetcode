class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int m = s.length(), n = dictionary.size();
        char[] arr = s.toCharArray();
        String res = "";
        int len = 0;

        for (String t : dictionary) {
            char[] str = t.toCharArray();
            int l = str.length, x = -1, y = 0;

            while ((++x < m) && (y < l)) {
                if (arr[x] == str[y]) y++;
            } 

            if (y == l) {
                if (l > len) {
                    len = l;
                    res = t;
                } else if (l == len) {
                    if (res.compareTo(t) > 0) res = t;
                }
            }
        } 

        return res;
    }
}
