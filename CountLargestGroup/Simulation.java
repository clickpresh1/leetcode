class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37];

        int maxFreq = 0, currSum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                int k = i, sum = 0;

                while (k > 0) {
                    sum += k % 10;

                    k /= 10;
                } 

                currSum = sum;
                freq[currSum]++;
            } else {
                currSum++;
                freq[currSum]++;
            }

            if (freq[currSum] > maxFreq) maxFreq = freq[currSum];
        } 

        int count = 0;
        for (int i = 1; i < 37; i++) if (freq[i] == maxFreq) count++;

        return count;
    }
}
