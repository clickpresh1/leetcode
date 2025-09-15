import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        int value = 0;
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < (i + 1); j++) {
                if ((j == 0) || (j == i)) {
                    value = 1;
                    list.add(value);
                } else {
                    value = listList.get(i - 1).get(j - 1) + listList.get(i - 1).get(j);
                    list.add(value);
                }
            } 
            listList.add(list);
        } 


        return listList;
    } 
}
