// time limit exceeded for c = 2147483647
// time limit exceeded for c = 2147483647

class Solution {
    public boolean judgeSquareSum(int c) {
        if (c == 0) return true;
        HashMap<Integer, Long> hashMap = new HashMap<>();
        int k = (int) Math.sqrt(c);
        for (int i = 1; i <= k; i++) {
            long iSq = i * i;
            long iDiff = c - (iSq);
            hashMap.put(i, iDiff);
            if (hashMap.containsValue(iSq)) {
                return true;
            } 

            int iRev = k - (i - 1);
            long iRevSq = iRev * iRev;
            long iRevDiff = c - (iRevSq);
            hashMap.put(iRev, iRevDiff);
            if (hashMap.containsValue(iRevSq)) {
                return true;
            }


            // hashMap.put(i, iDiff);

            // int L = i;
            // while (L <= k) {
            //     long d = L * L;
            //     if (d == hashMap.get(i)) {
            //         return true;
            //     } else {
            //         L += 1;
            //     }
            // } 
        } 
        
        return false;
    }
}
