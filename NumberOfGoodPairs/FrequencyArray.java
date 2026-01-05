class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int count = 0;

        for (int item : nums) {
            int localCount1 = 0;
            int k = (freq[item] / 2) * (freq[item] - 1);
            int q = freq[item] * ((freq[item] - 1) / 2);

            localCount1 = (freq[item] % 2 == 0) ? k : q;

            freq[item]++;

            int localCount2 = 0;
            k = (freq[item] / 2) * (freq[item] - 1);
            q = freq[item] * ((freq[item] - 1) / 2);

            localCount2 = (freq[item] % 2 == 0) ? k : q;

            count += localCount2 - localCount1;
        }

        return count;
    }
}
