class Solution {
    public int findKthPositive(int[] arr, int k) {
        int curr = 1, i = 0, m = arr.length, count = 0;

        while (i < m) {
            while (arr[i] - curr > 0) {
                count++;
                if (count == k) return curr;
                curr++;
            }

            curr++;
            i++;
        } 

        return --curr + (k - count);
    }
}
