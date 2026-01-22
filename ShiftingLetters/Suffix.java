class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int m = s.length();
        char[] arr = new char[m];

        int suff = 0;
        for (int i = m - 1; i >= 0; i--) {
            suff = (suff + shifts[i]) % 26;
            int k = ((s.charAt(i) - 'a') + suff) % 26;
            arr[i] = (char) ('a' + k);
        }

        return new String(arr);
    } 
}
