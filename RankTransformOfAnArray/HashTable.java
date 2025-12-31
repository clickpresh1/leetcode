class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int m = arr.length;

        int[] cop = new int[m];

        for (int i = 0; i < m; i++) cop[i] = arr[i];

        Arrays.sort(cop);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0, j = 1; i < m; i++) {
            if (!(map.containsKey(cop[i]))) {
                map.put(cop[i], j++);
            }
        } 

        for (int i = 0; i < m; i++) {
            arr[i] = map.get(arr[i]);
        } 

        return arr;
    }
}
