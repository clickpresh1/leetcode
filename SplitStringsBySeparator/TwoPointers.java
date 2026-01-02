class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>(words.size());

        for (String s : words) {
            int j = 0, m = s.length();
            for (int i = 0; i <= m; i++) {
                if ((i == m) || (s.charAt(i) == separator)) {
                    if (i > j) list.add(s.substring(j, i));

                    j = i + 1;
                }    
            } 
        }

        return list;
    }
}
