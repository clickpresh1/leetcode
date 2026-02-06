class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int m = words.length, cnt = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (pairs(words[i], words[j])) {
                    cnt++;
                    break;
                }
            }
        } 

        return cnt;
    } 

    public static boolean pairs(String a, String b) {

        return ((a.charAt(0) == b.charAt(1)) && (a.charAt(1) == b.charAt(0))) ? true : false;
    }
}
