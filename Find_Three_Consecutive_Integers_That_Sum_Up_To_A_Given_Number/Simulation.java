class Solution {
    public long[] sumOfThree(long num) {
       long m = num % 3, n = num / 3;

        return (m != 0) ? new long[] {} : new long[] {--n, ++n, ++n};
    }
} 
