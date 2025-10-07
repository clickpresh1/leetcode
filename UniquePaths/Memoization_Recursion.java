class Solution {
    public int uniquePaths(int m, int n) {
        int[][] pathsArr = new int[m][n];
        return uniquePaths(0, 0, new HashMap<>(), pathsArr);
    } 

    public static int uniquePaths(int i, int j, HashMap<List<Integer>, Integer> hashMap, int[][] pathsArr) {
        int m = pathsArr.length;
        int n = pathsArr[0].length;

        if ((i >= m) || (j >= n)) {
            return 0;
        }

        if ((i == m - 1) && (j == n - 1)) {
            return 1;
        }
        
        List<Integer> list = List.of(i, j);
        if (hashMap.containsKey(list)) {
            return hashMap.get(list);
        } 

        int result = uniquePaths(i + 1, j, hashMap, pathsArr) + uniquePaths(i, j + 1, hashMap, pathsArr);
        hashMap.put(list, result);

        return result;
    } 
}
