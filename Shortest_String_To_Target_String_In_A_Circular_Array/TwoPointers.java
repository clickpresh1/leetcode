class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        if (words[startIndex].equals(target)) return 0;

        int m = words.length, i = 1;
        int countF = 1, countB = 1;
        int f = startIndex + 1, b = startIndex - 1;

        while (i++ < m) {
            if (f == m) f = 0;
            if (words[f++].equals(target)) return countF;
            else countF++;

            if (b < 0) b = m - 1;
            if (words[b--].equals(target)) return countB;
            else countB++;
        } 

        return -1;
    }
}
