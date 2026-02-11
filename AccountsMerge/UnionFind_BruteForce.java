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

        for (int i : roots) rootsSet.add(root(roots, i));

        for (int i : rootsSet) {
            List<String> listA = accounts.get(i);
            int f = root(roots, i);
            for (int j = 0; j < m; j++) {
                int g = root(roots, j);

                if (f == g) {
                    listA = merge(listA, accounts.get(j));
                } 
            } 

            listA.subList(1, listA.size()).sort(null);
            list.add(listA);    
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

    public static List<String> merge(List<String> listA, List<String> listB) {
        Set<String> mergeSet = new HashSet<>();

        for (int i = 1; i < listA.size(); i++) mergeSet.add(listA.get(i));

        for (int i = 1; i < listB.size(); i++) mergeSet.add(listB.get(i));

        List<String> mergeList = new ArrayList<>();

        mergeList.add(listA.get(0));

        for (String s : mergeSet) mergeList.add(s);

        return mergeList; 
    }
}
