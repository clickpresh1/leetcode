import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findJudge(int n, int[][] trust) {
        int maxValue = 0;
        int keyOfMax = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();

        if ((trust.length == 0) && (n == 1)) {
            return 1;
        } else if ((trust.length == 0) && (n > 1)) {
            return -1;
        }
        for (int i = 0; i < trust.length; i++) {
            hashSet.add(trust[i][0]);
            if (hashMap.containsKey(Integer.valueOf(trust[i][1]))) {
                int newValue = hashMap.get(trust[i][1]);
                newValue += 1;
                hashMap.put(trust[i][1], newValue);
            } else {
                hashMap.put(trust[i][1], 1);
            }
        
            if (hashMap.containsKey(Integer.valueOf(trust[i][0]))) {
                hashMap.remove(Integer.valueOf(trust[i][0]));
            }
            if (hashSet.contains(Integer.valueOf(trust[i][1]))) {
                hashMap.remove(Integer.valueOf(trust[i][1]));
                continue;
            }
            
            if (hashMap.get(trust[i][1]) >= maxValue) {
                keyOfMax = trust[i][1];
            } 
            maxValue = Math.max(maxValue, hashMap.get(trust[i][1]));
        } 

        if ((maxValue == n - 1) && (hashMap.get(keyOfMax) != null)) {
            return keyOfMax;
        } else {
            return -1;
        }
    } 
}
