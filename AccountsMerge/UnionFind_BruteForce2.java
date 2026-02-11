class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int m = accounts.size();
        List<List<String>> list = new ArrayList<>();

        int[] roots = new int[m];

        for (int i = 0; i < m; i++) roots[i] = i;

        for (int i = 0; i < m; i++) {
            int a = root(roots, i);
            for (int j = i + 1; j < m; j++) {
                if (comMail(accounts.get(i), accounts.get(j))) {
                    int b = root(roots, j);

                    if (a != b) {
                        roots[b] = a;
                    } 
                }
            }
        } 

        Set<Integer> rootsSet = new HashSet<>();

        Map<Integer, Set<String>> rootsMap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int r = root(roots, i);

            if (!rootsMap.containsKey(r)) {
                rootsMap.put(r, new HashSet<>());
            } 

            List<String> l = accounts.get(i);

            for (int j = 1; j < l.size(); j++) {
                rootsMap.get(r).add(l.get(j));
            } 
        } 

        for (int s : rootsMap.keySet()) {
            List<String> locList = new ArrayList<>();

            locList.add(accounts.get(s).get(0));
            locList.addAll(rootsMap.get(s));
            locList.subList(1, locList.size()).sort(null);

            list.add(locList);
        } 

        return list;
    } 

    public static int root(int[] roots, int x) {
        if (roots[x] == x) return x;

        return roots[x] = root(roots, roots[x]);
    }

    public static boolean comMail(List<String> listA, List<String> listB) {
        Set<String> booSet = new HashSet<>();

        for (String s : listA) booSet.add(s);

        for (int i = 1; i < listA.size(); i++) booSet.add(listA.get(i));

        for (int i = 1; i < listB.size(); i++) {
            if (booSet.contains(listB.get(i))) return true;
        } 

        return false;
    } 
}
