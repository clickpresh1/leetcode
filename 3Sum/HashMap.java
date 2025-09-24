import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> listList = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
                int check = (0 - nums[i]) - nums[j];

                List<Integer> list = new ArrayList<>();
                if (hashMap.containsKey(check)) {
                    list.add(nums[i]);
                    list.add(check);
                    list.add(nums[j]);
                    Collections.sort(list);
                    listList.add(list);
                } 

                hashMap.put(nums[j], j);
                
            }
        }
        return new ArrayList<>(listList);  
    } 
}
