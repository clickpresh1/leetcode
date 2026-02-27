class Solution {
    public int[] frequencySort(int[] nums) {
        int m = nums.length;
        int[] map = new int[201];

        for (int item : nums) map[item + 100]++;

        List<Integer>[] bucks = new ArrayList[m + 1];
        
        for (int i = 0; i < 201; i++) {
            if (map[i] == 0) continue;

            int f = map[i];

            if (bucks[f] == null) bucks[f] = new ArrayList<>();

            bucks[f].add(i - 100);
        }

        int q = 0;
        for (int i = 1; i < m + 1; i++) {
            if (bucks[i] == null) continue;

            List<Integer> temp = bucks[i];

            Collections.sort(temp);

            for (int j = temp.size() - 1; j >= 0; j--) {
                for (int k = 0; k < i; k++) nums[q++] = temp.get(j);
            }
        } 

        return nums;
    }
}
