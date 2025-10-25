class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int x = 0;
            int y = n - 1;
            while (x <= y) {
                int mid = x + ((y - x) / 2);
                if (matrix[i][mid] == target) return true;
                else if (matrix[i][mid] > target) y = mid - 1;
                else x = mid + 1;
            } 
        } 

        return false;
    }
}
