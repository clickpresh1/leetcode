import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean containsDuplicate = false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(set.contains(nums[i]))) {
                set.add(nums[i]);
            } else {
                containsDuplicate = true;
                break;
            }
        } 
        
        return containsDuplicate;
    }
}
