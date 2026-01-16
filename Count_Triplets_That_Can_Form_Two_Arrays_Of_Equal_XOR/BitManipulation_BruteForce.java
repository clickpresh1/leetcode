class Solution {
    public int countTriplets(int[] arr) {
        int m = arr.length, count = 0;

        for (int i = 0; i < m - 1; i++) {
            int b = 0;
            for (int j = i; j < m; j++) {
                b ^= arr[j];

                if (b == 0) count += (j - i);
            } 
        } 

        return count;
    }
}
