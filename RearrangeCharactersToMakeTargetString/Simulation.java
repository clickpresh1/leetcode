class Solution {
    public int rearrangeCharacters(String s, String target) {
        int m = s.length(), n = target.length(), min = 100;

        if (n > m) return 0;

        int[] freqTar = new int[26], freqS = new int[26];

        for (char c : target.toCharArray()) freqTar[c - 'a']++;

        for (char c : s.toCharArray()) freqS[c - 'a']++;

        for (char c : target.toCharArray()) {
            if (freqTar[c - 'a'] <= freqS[c - 'a']) {
                int x = freqS[c - 'a'] / freqTar[c - 'a'];
                if (x < min) min = x;
            } else return 0;
        } 

        return min;
    }
}
