class Solution {
    public int minimumPossibleSum(int n, int target) {
        long m = n, t = n;
        long tag = target;
        long sum = 0;

        long k = tag / 2;

        if (t <= k) {
            long val = ((t & 1) != 0) ? t * ((t + 1) / 2) : (t / 2) * (t + 1); 
            val %= 1000000007;

            return (int) val;
        }

        long count = k;

        long sumToK = ((k & 1) != 0) ? k * ((k + 1) / 2) : (k / 2) * (k + 1); 

        sum += sumToK;

        sum %= 1000000007;

        if (count == m) return (int) sum;

        sum += tag;

        count++;

        long sumTotag = ((tag & 1) != 0) ? tag * ((tag + 1) / 2) : (tag / 2) * (tag + 1);

        long last = (m - count) + tag;

        long sumToLast = ((last & 1) != 0) ? last * ((last + 1) / 2) : (last / 2) * (last + 1);

        long diff = sumToLast - sumTotag;

        sum += diff;

        sum %= 1000000007;

        if (sum < 0) sum += 1000000007;

        return (int) sum;
    }
}
