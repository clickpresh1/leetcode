class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int m = target.length;
        int[] freq1 = new int[1001], freq2 = new int[1001];

        for (int i = 0; i < m; i++) {
            freq1[target[i]]++;
            freq2[arr[i]]++;
        } 

        for (int item : target) {
            if (freq1[item] != freq2[item]) return false;
        } 

        return true;
    }
}
