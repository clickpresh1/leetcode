class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int i = 0;

        while (i < 4) {
            if (isEquals(mat, target)) return true;

            i++;
            rotateNinety(mat);
        }

        return false;
    } 

    public static boolean isEquals(int[][] a, int[][] b) {
        int m = a.length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        } 

        return true;
    }

    public static void rotateNinety(int[][] arr) {
        int m = arr.length;

        for (int i = 0; i < m; i++) {
            for (int j = i; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        } 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m - 1 - j];
                arr[i][m - 1 - j] = temp;
            }
        }
    }
}
