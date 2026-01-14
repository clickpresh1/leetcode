class Solution {
    public int maxRepeating(String sequence, String word) {
        int m = sequence.length(), n = word.length(), i = 0, max = 0;

        while (i < m - n + 1) {
            int j = i++, count = 0;
            
            while ((j < m - n + 1) && (sequence.regionMatches(j, word, 0, n))) {
                count++; j += n;
            }  

            if (count > max) max = count;
        }

        return max;
    }
}
