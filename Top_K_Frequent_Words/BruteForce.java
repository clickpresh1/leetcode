class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int m = words.length;
        Map<String, Integer> map = new HashMap<>();

        for (String s : words) map.put(s, map.getOrDefault(s, 0) + 1);

        List<String> list = new ArrayList<>();

        for (int i = m - 1; i >= 0; i--) {
            List<String> temp = new ArrayList<>();

            for (String s : map.keySet()) {
                if (map.get(s) == i) temp.add(s);
            } 

            int tSize = temp.size();

            if (tSize == 0) continue; 

            Collections.sort(temp);

            for (int j = 0; j < tSize; j++) {
                list.add(temp.get(j));

                if (list.size() == k) return list;
            }      
        } 

        return list;
    } 
}
