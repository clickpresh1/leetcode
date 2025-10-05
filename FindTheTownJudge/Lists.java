class Solution {
    public int findJudge(int n, int[][] trust) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        if (trust.length == 0){
            if (n == 1) return n;
            else if (n > 1) return -1;
        } 

        for (int i = 0; i < trust.length; i++) {
            list2.add(trust[i][0]);
            if (!(list2.contains(trust[i][1]))) {
                if (!(list1.contains(trust[i][1]))) {
                    list1.add(trust[i][1]);
                }
            } 

            if ((list1.contains(trust[i][0])) && (list2.contains(trust[i][0]))) {
                list1.remove(Integer.valueOf(trust[i][0]));
            }
        } 

        if (!(list1.isEmpty())) {
            for (int i = 0; i < trust.length; i++) {
                if (trust[i][1] == list1.get(0)) {
                    if (!(list3.contains(trust[i][0]))) {
                        list3.add(trust[i][0]);
                    }
                }
            } 
            if (list3.size() == n - 1) {
                return list1.get(0);
            } else {
                return -1;
            }
        } else return -1; 
    }
}
