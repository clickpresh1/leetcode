class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);

        return list;
    } 

    public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, boolean[] boos) {
        int n = nums.length;
        
        if (temp.size() == n) list.add(new ArrayList<>(temp));
        else {
            for (int i = 0; i < n; i++) {
                if ((boos[i]) || ((i > 0) && (nums[i] == nums[i - 1]) && (!boos[i - 1]))) continue;
                else {
                    boos[i] = true;
                    temp.add(nums[i]);
                    backtrack(list, temp, nums, boos);
                    boos[i] = false;
                    temp.remove(temp.size() - 1);
                }
            }
        }
    }
} 

