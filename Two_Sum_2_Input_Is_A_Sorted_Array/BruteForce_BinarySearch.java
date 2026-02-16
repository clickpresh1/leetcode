class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int m = numbers.length;

        for (int i = 0; i < m; i++) {
            int f = numbers[i], d = target - f;

            int x = 0, y = m - 1;
            while (x <= y) {
                int mid = x + ((y - x) / 2);

                if (mid == i) {
                    if (mid < m - 1) mid += 1;
                    else if (mid > 0) mid -= 1;
                } 

                int midVal = numbers[mid];

                if (midVal == d) return new int[] {i + 1, mid + 1};
                else if (midVal < d) x = mid + 1;
                else y = mid - 1;
            } 
        } 

        return new int[] {};
    } 
}
