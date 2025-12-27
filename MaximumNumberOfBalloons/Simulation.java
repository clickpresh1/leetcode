class Solution {
    public int maxNumberOfBalloons(String text) {
        String bal = "balloon";
        int min = 10000;
        int[] freqBal = new int[26], freqText = new int[26];

        for (char c : bal.toCharArray()) freqBal[c - 'a']++;

        for (char c : text.toCharArray()) freqText[c - 'a']++;

        for (char c : bal.toCharArray()) {
            if (freqText[c - 'a'] >= freqBal[c - 'a']) {
                int z = freqText[c - 'a'] / freqBal[c - 'a'];
                if (z < min) min = z;
            } else return 0;
        }

        return min;
    }
}
