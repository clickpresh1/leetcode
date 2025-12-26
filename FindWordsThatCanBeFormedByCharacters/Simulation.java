class Solution {
    public int countCharacters(String[] words, String chars) {
        int m = words.length, n = chars.length(), sum = 0;

        int[] freqChars = new int[26];

        for (char c : chars.toCharArray()) freqChars[c - 'a']++;

        for (String s : words) {
            int[] freqWord = new int[26];

            boolean boo = true;
            for (char c : s.toCharArray()) {
                freqWord[c - 'a']++;
                if (freqWord[c - 'a'] > freqChars[c - 'a']) {
                    boo = false;
                    break;
                }
            }

            sum += (boo) ? s.length() : 0;
        } 

        return sum;
    }
}
