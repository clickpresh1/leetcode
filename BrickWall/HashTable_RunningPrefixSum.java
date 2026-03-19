class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int m = wall.size(), mxValue = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (List<Integer> list : wall) {
            int runPref = 0;

            for (int j = 0; j < list.size() - 1; j++) {
                runPref += list.get(j);

                int f = map.getOrDefault(runPref, 0);
                map.put(runPref, ++f); 

                if (f > mxValue) mxValue = f;
            } 
        } 

        return m - mxValue;
    }
}
