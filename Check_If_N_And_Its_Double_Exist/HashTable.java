class Solution {
    public boolean checkIfExist(int[] arr) {
        int m = arr.length;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            if (set.contains(arr[i])) return true;
            else {
                set.add(arr[i] * 2);
                if (arr[i] % 2 == 0) set.add(arr[i] / 2);
            }
        }

        return false;
    }
}
