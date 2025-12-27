class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] nonNeg = new int[1001], neg = new int[1001];

        for (int n : arr) {
            if (n >= 0) nonNeg[n]++;
            else {
                int x = n * -1;
                neg[x]++;
            }
        } 

        int sum = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 1001; i++) {
            if (nonNeg[i] > 0) {
                sum++;
                set.add(nonNeg[i]);
            } 

            if (neg[i] > 0) {
                sum++;
                set.add(neg[i]);
            }
        } 

        return sum == set.size();
    }
}
