class Solution {
    public String convert(String s, int numRows) {
        int m = s.length();

        if ((m == 1) || (numRows == 1)) return s;

        int f = (numRows + (numRows - 2)) / (numRows - 1);
        int numCols = (m / f) + 1;

        char[] arr = s.toCharArray();
        char[][] mat = new char[numRows][numCols];

        int modCol = numRows - 1, k = 0, p = numRows - 2;
        for (int j = 0; ((k < m) && (j < numCols)); j++) {
            if (j % modCol == 0) {
                for (int i = 0; ((k < m) && (i < numRows)); i++) {
                    mat[i][j] = arr[k++];
                } 
            } else {
                mat[p--][j] = arr[k++];

                if (p == 0) p = numRows - 2;
            } 
        } 

        StringBuilder sb = new StringBuilder();
        for (char[] row : mat) {
            for (char c : row) {
                if (c != '\u0000') sb.append(c);
            }
        } 

        return sb.toString();
    }
}
