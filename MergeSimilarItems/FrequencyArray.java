class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] freq = new int[1001];
        int mx = -1, mn = 1001;

        for (int[] arr : items1) {
            int key = arr[0];
            freq[key] = arr[1];

            if (key > mx) mx = key;
            if (key < mn) mn = key;
        } 

        for (int[] arr : items2) {
            int key = arr[0];

            freq[key] += arr[1];

            if (key > mx) mx = key;
            if (key < mn) mn = key;
        } 

        List<List<Integer>> list = new ArrayList<>();

        for (int i = mn; i < mx + 1; i++) {
            if (freq[i] > 0) {
                list.add(List.of(i, freq[i]));
            } 
        } 

        return list;
    }
}
