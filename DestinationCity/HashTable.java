class Solution {
    public String destCity(List<List<String>> paths) {
        int m = paths.size();
        Set<String> set = new HashSet<>();

        for (List<String> l : paths) set.add(l.get(0));

        for (List<String> l : paths) {
            String s = l.get(1);
            if (!set.contains(s)) return s;
        }

        return null;
    }
}
