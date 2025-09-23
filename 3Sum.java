import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ((i > 0) && (nums[i] == nums[i - 1])) {
                continue;
            } 

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int checkSum = nums[i] + nums[j] + nums[k];

                if (checkSum < 0) {
                    j++;
                } else if (checkSum > 0) {
                    k--;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    listList.add(list);

                    j++;
                    k--;

                    while ((j < k) && (nums[j] == nums[j - 1])) {
                        j++;
                    } 
                    while ((j < k) && (nums[k] == nums[k + 1])) {
                        k--;
                    }
                }
            }
        }

        return listList;
        
    } 

}
