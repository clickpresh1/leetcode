class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int m = words.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (words[i].indexOf(x) != -1) list.add(i);
        }

        return list;
    }
}
