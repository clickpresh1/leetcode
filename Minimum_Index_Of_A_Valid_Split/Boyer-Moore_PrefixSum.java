class Solution {
    public int minimumIndex(List<Integer> nums) {
        int m = nums.size(), cnt = 0, majElem = 0;

        for (int item : nums) {
            if (cnt > 0) {
                if (item == majElem) cnt++;
                else cnt--;
            } else if (cnt == 0) {majElem = item; cnt++;} 
        } 

        int[] pref = new int[m];

        int counter = 0, k = 0;
        for (int item : nums) {
            if (item == majElem) counter++;

            pref[k++] = counter;
        } 

        int M = pref[m - 1];
        for (int i = 0; i < m; i++) {
            if ((pref[i] * 2) > (i + 1)) {
                if ((M - pref[i]) * 2 > (m - (i + 1))) return i;
            } 
        } 

        return -1;
    }
}
