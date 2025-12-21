class Solution {
    public List<String> commonChars(String[] words) {
        int m = words.length;
        List<String> list = new ArrayList<>();

        int[] freq1 = new int[27];
        for (int i = 0; i < words[0].length(); i++) {
            freq1[words[0].charAt(i) - 'a' + 1]++;
        }

        for (int i = 0; i < m; i++) {
            int[] freq2 = new int[27];
            for (int j = 0; j < words[i].length(); j++) {
                freq2[words[i].charAt(j) - 'a' + 1]++;
            } 

            for (int k = 1; k < 27; k++) {
                if (freq1[k] > freq2[k]) {
                    freq1[k] = freq2[k];
                } 
            }
        } 

        for (int i = 1; i < 27; i++) {
            if (freq1[i] != 0) {
                int q = freq1[i];
                while (q > 0) {
                    char z = (char) ('a' + i - 1);
                    list.add(String.valueOf(z));
                    
                    q--;
                }
            }
        }

        return list;
    }
}
