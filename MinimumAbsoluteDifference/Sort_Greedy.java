class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int gloMin = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int locMin = arr[i] - arr[i - 1];
            if (locMin < gloMin) {
                gloMin = locMin;
                list.clear();
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if (locMin == gloMin) {
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        } 

        return list;
    }
}
