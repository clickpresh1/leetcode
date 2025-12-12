class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] freq = new int[27];
        int s = licensePlate.length(), m = words.length, min = Integer.MAX_VALUE, y = 0;

        for (int i = 0; i < s; i++) {
            if ((licensePlate.charAt(i) >= 'A') && (licensePlate.charAt(i) <= 'z')) {
                char x = Character.toLowerCase(licensePlate.charAt(i));
                freq[x - 'a' + 1]++;
            }
        } 

        for (int i = 0; i < m; i++) {
            boolean boo = true;
            int[] count = new int[27];
            for (int j = 0; j < words[i].length(); j++) {
                if ((words[i].charAt(j) >= 'A') && (words[i].charAt(j) <= 'z')) {
                    char x = Character.toLowerCase(words[i].charAt(j));
                    count[x - 'a' + 1]++;
                }
            } 

            for (int k = 1; k < 27; k++) {
                if ((freq[k] > 0) && (freq[k] > count[k])) {
                    boo = false;
                    break;
                } 
            } 

            if (boo) {
                if (words[i].length() < min) {
                    min = words[i].length();
                    y = i;
                }
            }
        } 

        return words[y];
    }
}
