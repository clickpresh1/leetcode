class Solution {
    public int[] numberOfPairs(int[] nums) {
        int m = nums.length, x = 0, y = m;
        int[] map = new int[101];

        for (int item : nums) {
            map[item]++;

            if (map[item] % 2 == 0) {x++; y -= 2;}
        } 

        return new int[] {x, y};
    }
}
