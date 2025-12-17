class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words1) 
            map.put(word, map.getOrDefault(word, 0) + 1);

        for (String word : words2) 
            map.put(word, map.getOrDefault(word, 0) + 1000);

        int z = 0;
        for (int value : map.values()) if (value == 1001) z++;

        return z; 
    }
}
