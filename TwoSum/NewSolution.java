import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];

            if (hashMap.containsKey(check)) {
                arr[0] = hashMap.get(check);
                arr[1] = i;
            } 

            if (!(hashMap.containsKey(nums[i]))) {
                hashMap.put(nums[i], i);
            } 

        }

        System.out.println(Arrays.toString(arr));
        
        return arr;  
    } 
    
}
