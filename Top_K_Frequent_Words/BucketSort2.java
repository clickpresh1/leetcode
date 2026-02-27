class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int m = words.length;
        Map<String, Integer> map = new HashMap<>();

        for (String s : words) map.put(s, map.getOrDefault(s, 0) + 1);

        List<String>[] bucks = new ArrayList[m + 1];

        for (String s : map.keySet()) {
            int f = map.get(s);

            if (bucks[f] == null) bucks[f] = new ArrayList<>();
            bucks[f].add(s);
        }

        List<String> list = new ArrayList<>(); 

        for (int i = m; i >= 1; i--) {
            if (bucks[i] == null) continue;

            List<String> temp = bucks[i];
            Collections.sort(temp);

            for (String str : temp) {
                list.add(str);

                if (list.size() == k) return list;
            }
        }

        return list;
    } 
}
