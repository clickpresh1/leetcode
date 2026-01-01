class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        boolean[] boo = new boolean[n];

        for (int i = 0; i < m; i++) {
            int min = matrix[i][0], indx = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    indx = j;
                } 
            } 

            if (boo[indx]) continue;

            int max = matrix[0][indx];
            for (int k = 0; k < m; k++) {
                if (matrix[k][indx] > max) {
                    max = matrix[k][indx];
                }
            } 

            if (min == max) {
                list.add(min);
                boo[indx] = true;
            }
        } 

        return list;
    } 
}
