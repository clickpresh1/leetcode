class Solution {
    public int minPathSum(int[][] grid) {
        return minPathSum(grid, 0, 0, new HashMap<>());
    } 

    public static int minPathSum(int[][] grid, int row, int col, HashMap<List<Integer>, Integer> hashMap) {

        if ((row >= grid.length) || (col >= grid[0].length)) {
            return Integer.MAX_VALUE;
        } 

        if ((row == grid.length - 1) && (col == grid[0].length - 1)) {
            return grid[row][col];
        }

        List<Integer> list = List.of(row, col);
        if (hashMap.containsKey(list)) {
            return hashMap.get(list);
        } 

        int result = grid[row][col] + Math.min(minPathSum(grid, row + 1, col, hashMap), minPathSum(grid, row, col + 1, hashMap));

        hashMap.put(list, result);

        return result;
    }
}
