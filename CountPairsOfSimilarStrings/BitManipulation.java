class Solution {
    public int similarPairs(String[] words) {
        int m = words.length, count = 0;
        int[] bitbs = new int[m];

        for (int i = 0; i < m; i++) {
            bitbs[i] = bitMask(words[i]);
        } 

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (bitbs[i] == bitbs[j]) count++;
            } 
        } 

        return count;
    } 

    public static int bitMask(String s) {
        int m = s.length(), b = 0;

        for (int i = 0; i < m; i++) {
            b |= 1 << (s.charAt(i) - 'a');
        } 

        return b;
    } 
}
