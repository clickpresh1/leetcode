class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, int[]> map = new HashMap<>();

        for (String word : words1) {
            if (map.containsKey(word)) map.get(word)[0]++;
            else {
                map.put(word, new int[2]);
                map.get(word)[0] = 1;
            }
        }

        for (String word : words2) {
            if (map.containsKey(word)) map.get(word)[1]++;
            else {
                map.put(word, new int[2]);
                map.get(word)[1] = 1;
            }
        }

        int z = 0;
        for (int[] value : map.values()) 
            if ((value[0] == 1) && (value[1] == 1)) z++;

        return z; 
    }
}
