// Swap rows and transpose matrix, and brute force
// Swap rows and transpose matrix, and brute force

public class Solution {
    public int[][] rotate(int[][] nums){
        HashSet<ArrayList<Integer>> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int helper = nums[i][j];
                nums[i][j] = nums[nums.length - 1 -i][j];
                nums[nums.length - 1 - i][j] = helper;
            }
        } 

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                Collections.sort(list);
                if (!(hashSet.contains(list))) {
                    int helper = nums[i][j];
                    nums[i][j] = nums[j][i];
                    nums[j][i] = helper;

                    hashSet.add(list);
                }
                
            }
            
        }
        
        return nums;
    }
}
