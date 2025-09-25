import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int val = triangle.get(i).get(j);

                int lVal = triangle.get(i + 1).get(j);
                int rVal = triangle.get(i + 1).get(j + 1);

                int minVal = Math.min(lVal, rVal);

                triangle.get(i).set(j, val + minVal);
            }
            
        }

       return triangle.get(0).get(0);         
    } 
}
