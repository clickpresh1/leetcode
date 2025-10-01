import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int totalNumber = matrix.length * matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftRow = 0;
        int rightRow = matrix[0].length - 1;
        
        while (true) {
            if (list.size() == totalNumber) {
                break;
            }
            
            for (int i = leftRow; i <= rightRow; i++) {
                list.add(matrix[topRow][i]);
            } 
            topRow++;
            
            for (int i = topRow; i <= bottomRow; i++) {
                list.add(matrix[i][rightRow]);
            } 
            rightRow--;
            
            if (topRow <= bottomRow) {
                for (int i = rightRow; i >= leftRow; i--) {
                    list.add(matrix[bottomRow][i]);
                } 
                bottomRow--;
            }

            
            if (leftRow <= rightRow) {
                for (int i = bottomRow; i >= topRow; i--) {
                    list.add(matrix[i][leftRow]);
                } 
                leftRow++;
            }
        }

        return list;
    } 
}
