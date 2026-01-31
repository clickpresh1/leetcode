class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int m = words.length, count = 0;

        int vowelBitmask = (1 << 0) | (1 << 4) | (1 << 8) | (1 << 14) | (1 << 20);

        for (int i = left; i < right + 1; i++) {
            int len = words[i].length();

            int a = words[i].charAt(0) - 'a'; 
            int b = words[i].charAt(len - 1) - 'a';

            boolean boo1 = (vowelBitmask & (1 << a)) != 0;
            boolean boo2 = (vowelBitmask & (1 << b)) != 0;

            if (boo1 && boo2) count++;
        } 

        return count;
    }
}
