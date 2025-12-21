class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] freq = new int[27];

        for (int i = 0; i < 26; i++) 
            freq[order.charAt(i) - 'a' + 1] = i;

        for (int i = 1; i < words.length; i++) {
            int k = 0, q = 0;
            int a = words[i - 1].length(), b = words[i].length();

            while ((k < a) && (q < b)) {
                int x = words[i - 1].charAt(k) - 'a' + 1;
                int y = words[i].charAt(q) - 'a' + 1;

                if (freq[x] > freq[y]) return false;
                else if (freq[x] < freq[y]) break;
                else {
                    k++;
                    q++;
                } 

                if ((a > b) && ((k < a) && (q == b))) return false;
            }
        } 

        return true;
    } 
}
