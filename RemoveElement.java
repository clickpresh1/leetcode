import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> notValList = new ArrayList<>();
        for (int i : nums) {
            if ((i != val)) {
                notValList.add(i);
            }
        } 
        for (int i = 0; i < nums.length; i++) {
            if (i < notValList.size()) {
                nums[i] = notValList.get(i);
            } else {
                nums[i] = val;
            }
        } 
        int k = notValList.size();

        return k;
    } 

    
}
