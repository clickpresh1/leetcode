class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<String, List<Integer>> hashMap = new HashMap<>();
        hashMap.put("row", new ArrayList<>());
        hashMap.put("col", new ArrayList<>());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!(hashMap.get("row").contains(i))) {
                        hashMap.get("row").add(i);
                    } 
                    if (!(hashMap.get("col").contains(j))) {
                        hashMap.get("col").add(j);
                    } 
                } 
            }
        } 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (hashMap.get("row").contains(i) || hashMap.get("col").contains(j)) {
                    matrix[i][j] = 0;
                }
            } 
        }
    } 
}
