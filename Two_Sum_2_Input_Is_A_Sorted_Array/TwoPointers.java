class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int m = numbers.length, x = 0, y = m - 1;

        while (x < y) {
            int a = numbers[x], b = numbers[y], f = a + b;

            if (f == target) return new int[] {x + 1, y + 1};
            else if (f > target) y--;
            else x++;
        }

        return new int[] {};
    }
}
