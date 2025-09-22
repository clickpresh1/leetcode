import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.keySet().contains(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            } 
            
        } 

        int maxInt = Collections.max(hashMap.values()); 
        int sum = 0;
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i).equals(maxInt)) {
                sum += maxInt;
            }
        }

        return sum;        
    } 

}
