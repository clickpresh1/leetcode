class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int m = words.length;
        Map<String, Integer> map = new HashMap<>();

        for (String s : words) map.put(s, map.getOrDefault(s, 0) + 1);

        Map<Integer, List<String>> pam = new HashMap<>();

        for (String s : map.keySet()) {
            int f = map.get(s);

            if (!pam.containsKey(f)) pam.put(f, new ArrayList<>());
            pam.get(f).add(s);
        }

        List<String> list = new ArrayList<>(); 

        for (int i = m; i >= 1; i--) {
            if (pam.containsKey(i)) {
                List<String> temp = pam.get(i);
                Collections.sort(temp);

                for (String str : temp) {
                    list.add(str);
                    if (list.size() == k) return list;
                }
            }
        }

        return list;
    } 
}
