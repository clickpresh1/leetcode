class Solution {
    public List<String> stringMatching(String[] words) {
        int m = words.length;
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < m - 1; i++) {
            String s = words[i];
            int len1 = s.length();
            for (int j = i + 1; j < m; j++) {
                String t = words[j];
                int len2 = t.length();

                for (int k = 0; k < len1 - len2 + 1; k++) {
                    if (s.regionMatches(k, t, 0, len2)) {
                        set.add(t);
                        break;
                    } 
                } 

                for (int k = 0; k < len2 - len1 + 1; k++) {
                    if (t.regionMatches(k, s, 0, len1)) {
                        set.add(s);
                        break;
                    }
                }
            } 
        } 

        for (String str : set) list.add(str);

        return list;
    }
}
