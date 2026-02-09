class Solution {
    public List<String> removeAnagrams(String[] words) {
        int m = words.length, top = 0;
        List<String> list = new ArrayList<>();
        list.add(words[top]);

        for (int i = 1; i < m; i++) {
            if (!areAnagrams(words[i], words[top])) {
                list.add(words[i]);
                top = i;
            }
        } 

        return list;
    } 

    public static boolean areAnagrams(String s, String t) {
        int m = s.length(), n = t.length();

        if (m != n) return false;

        if (s.equals(t)) return true;

        int[] freq = new int[26];

        for (int i = 0; i < m; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        } 

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) return false;
        } 

        return true;
    }
}
