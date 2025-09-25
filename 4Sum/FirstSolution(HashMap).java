import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> listList = new HashSet<>();
        for (int k = 0; k < nums.length - 2; k++) {
            for (int i = k + 1; i < nums.length - 1; i++) {
                
                HashMap<Integer, Integer> hashMap = new HashMap<>();
                for (int j = i + 1; j < nums.length; j++) {
                    long sum = (long) nums[k] + (long) nums[i] + (long) nums[j];
                    long check = ((long) target) - sum;

                    List<Integer> list = new ArrayList<>();
                    if (((check >= Integer.MIN_VALUE) && (check <= Integer.MAX_VALUE))) {
                        if (hashMap.containsKey((int) check)) {
                            list.add(nums[k]);
                            list.add(nums[i]);
                            list.add((int) check);
                            list.add(nums[j]);
                            Collections.sort(list);
                            listList.add(list);
                        } 

                        hashMap.put(nums[j], j);   
                    }
                }
            }  
        }

        return new ArrayList<>(listList);
    } 
}
