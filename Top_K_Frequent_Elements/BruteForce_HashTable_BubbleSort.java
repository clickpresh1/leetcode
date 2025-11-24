class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!(map.containsKey(nums[i]))) {
                map.put(nums[i], 1);
            } else {
                int val = map.get(nums[i]);
                map.put(nums[i], val + 1);
            }
        } 

        int[][] arr = new int[map.size()][2];
        int j = 0;
        for (int key : map.keySet()) {
            arr[j][0] = key;
            arr[j][1] = map.get(key);
            j += 1;
        } 

        for (int p = 0; p < arr.length - 1; p++) {
            for (int q = 0; q < arr.length - 1; q++) {
                if (arr[q][1] > arr[q + 1][1]) {
                    int temp1 = arr[q][0];
                    int temp2 = arr[q][1];

                    arr[q][0] = arr[q + 1][0];
                    arr[q][1] = arr[q + 1][1];

                    arr[q + 1][0] = temp1;
                    arr[q + 1][1] = temp2;
                }
            }
        } 

        int[] res = new int[k];
        int s = 0;
        for (int r = arr.length - 1; r >= (arr.length - k); r--) {
            res[s] = arr[r][0];
            s += 1;
        } 

        return res;
    }
}
