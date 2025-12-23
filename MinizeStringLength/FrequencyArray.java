class Solution {
    public int minimizedStringLength(String s) {
        int[] freq = new int[27];
        int count = 0;

        for (char c : s.toCharArray()) {
            int q = c - 'a' + 1;
            freq[q]++;
            if (freq[q] == 1) count++;
        }

        return count;
    }
}
