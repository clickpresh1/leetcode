class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>(); 

        if ((trust.length == 0) && (n == 1)) {
            return 1;
        } else if ((trust.length == 0) && (n > 1)) {
            return -1;
        }
        for (int i = 0; i < trust.length; i++) {
            hashSet1.add(trust[i][0]);
            hashSet2.add(trust[i][1]);
            if (hashMap.containsKey(trust[i][1])) {
                int newValue = hashMap.get(trust[i][1]);
                newValue += 1;
                hashMap.put(trust[i][1], newValue);
            } else {
                hashMap.put(trust[i][1], 1);
            }
        } 
        Set<Integer> hashSetDiff21 = new HashSet<>(hashSet2);
        hashSetDiff21.removeAll(hashSet1);
        List<Integer> hashSetDiff21list = new ArrayList<>(hashSetDiff21);
        List<Integer> hashSet1list = new ArrayList<>(hashSet1);

        if (hashSet1list.size() == n - 1) {
            if (hashSetDiff21list.size() == 1) {
                int likelyJudge = hashSetDiff21list.get(0);
                int LJCount = hashMap.get(likelyJudge);
                if (LJCount == n - 1) {
                    return likelyJudge;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
