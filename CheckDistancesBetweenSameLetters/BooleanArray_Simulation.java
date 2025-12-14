class Solution {
    public boolean checkDistances(String s, int[] distance) {
        boolean[] boo = new boolean[26];
        int m = s.length();

        for (int i = 0; i < m; i++) {
            if (!boo[s.charAt(i) - 'a']) {
                int x = i + distance[s.charAt(i) - 'a'] + 1;
                if (x >= m) return false;
                if (s.charAt(i) != s.charAt(x)){
                    return false;
                } else boo[s.charAt(i) - 'a'] = true;
            }
        } 

        return true;
    } 
}
