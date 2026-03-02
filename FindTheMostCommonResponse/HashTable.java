class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        int m = responses.size();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

        for (List<String> l : responses) {
            for (String s : l) set.add(s);

            for (String s : set) map.put(s, map.getOrDefault(s, 0) + 1);

            set.clear();
        } 

        int mx = -1;
        String mxStr = null;
        for (String s : map.keySet()) {
            int f = map.get(s);
            if (f > mx) {
                mx = f;
                mxStr = s; 
            } else if (f == mx) {
                if (s.compareTo(mxStr) < 0) mxStr = s;
            }
        } 

        return mxStr;
    }
}
