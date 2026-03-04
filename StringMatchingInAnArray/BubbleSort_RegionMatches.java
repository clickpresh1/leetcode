class Solution {
    public List<String> stringMatching(String[] words) {
        int m = words.length;
        List<String> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            } 
        } 

        for (int i = 0; i < m; i++) {
            String s = words[i];
            int len1 = s.length();
            boolean stop = false;
            for (int j = i + 1; j < m; j++) {
                String t = words[j];
                int len2 = t.length();
                for (int k = 0; k < len2 - len1 + 1; k++) {
                    if (t.regionMatches(k, s, 0, len1)) {
                        list.add(s);
                        stop = true;
                        break;
                    } 
                } 

                if (stop) break;
            }
        }

        return list;
    }
}
