class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int m = energy.length;
        int currMax = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = m - 1; i >= 0; i--) {
            if (i + k >= m) {
                int result = energy[i];
                hashMap.put(i, result);
            } else {
                int result = energy[i] + hashMap.get(i + k);
                hashMap.put(i, result);
            } 

            currMax = Math.max(currMax, hashMap.get(i));
        } 

        return currMax;
    }
}
