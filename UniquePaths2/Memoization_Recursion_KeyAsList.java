class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return uniquePathsWithObstacles(0, 0, new HashMap<>(), obstacleGrid);
    } 

    public static int uniquePathsWithObstacles(int row, int col, HashMap<List<Integer>, Integer> hashMap, int[][] obstacleGrid) { 
        if ((row == obstacleGrid.length) || (col == obstacleGrid[0].length)) return 0;

        if (obstacleGrid[row][col] == 1) return 0;

        if ((row == obstacleGrid.length - 1) && (col == obstacleGrid[0].length - 1)) return 1;

        List<Integer> list = List.of(row, col);
        if (hashMap.containsKey(list)) {
            return hashMap.get(list);
        }

        int result = uniquePathsWithObstacles(row + 1, col, hashMap, obstacleGrid) + uniquePathsWithObstacles(row, col + 1, hashMap, obstacleGrid);
        hashMap.put(list, result);
        
        return result;
    } 
}
