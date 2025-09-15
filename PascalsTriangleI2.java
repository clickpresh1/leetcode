import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        int value = 0;
        List<List<Integer>> larger = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < (i + 1); j++) {
                if ((j == 0) || (j == i)) {
                    value = 1;
                    list.add(value);
                } else {
                    value = larger.get(i - 1).get(j - 1) + larger.get(i - 1).get(j);
                    list.add(value);
                }
            } 
            larger.add(list);
        } 

        return larger.get(rowIndex);
    } 
}
