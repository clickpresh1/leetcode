class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        char[] arr = s.toCharArray();
        List<List<Integer>> list = new ArrayList<>();
        int m = arr.length;

        for (int i = 1, x = 0, k = 1; i <= m; i++, k++) {
            if ((i == m) || (arr[i] != arr[x])) {
                if (k >= 3) list.add(List.of(x, x + k - 1));

                k = 0;
                x = i;
            } 
        } 

        return list;
    }
}
