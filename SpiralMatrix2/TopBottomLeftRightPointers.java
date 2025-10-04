class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int totalNumber = matrix.length * matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int[][] arr = new int[n][n];
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;
        int count = 0;
        
        while (true) {
            if (list.size() == totalNumber) {
                break;
            }
            
            for (int i = leftCol; i <= rightCol; i++) {
                list.add(matrix[topRow][i]);
                count += 1;
                arr[topRow][i] = count;
                
            } 
            topRow++;
            
            for (int i = topRow; i <= bottomRow; i++) {
                list.add(matrix[i][rightCol]);
                count += 1;
                arr[i][rightCol] = count;
            } 
            rightCol--;
            
            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    list.add(matrix[bottomRow][i]);
                    count += 1;
                    arr[bottomRow][i] = count;
                } 
                bottomRow--;
            }

            
            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    list.add(matrix[i][leftCol]);
                    count += 1;
                    arr[i][leftCol] = count;
                } 
                leftCol++;
            }
        }

        return arr;
    }
}
