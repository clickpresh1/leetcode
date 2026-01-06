class Solution {
    public String restoreString(String s, int[] indices) {
        int m = s.length();
        char[] c = new char[m];

        for (int i = 0; i < m; i++) c[indices[i]] = s.charAt(i);

        return new String(c);
    }
}
