class Solution {
    public int minimumIndex(List<Integer> nums) {
        int m = nums.size(), cnt = 0, majElem = nums.get(0);

        for (int item : nums) {
            if (cnt > 0) {
                if (item == majElem) cnt++;
                else cnt--;
            } else if (cnt == 0) {majElem = item; cnt++;}
        } 

        int tot = 0;
        for (int item : nums) if (item == majElem) tot++;

        int curr = 0;
        for (int i = 0; i < m - 1; i++) {
            if (nums.get(i) == majElem) curr++;

            if ((curr * 2) > (i + 1)) {
                if (((tot - curr) * 2) > (m - (i + 1))) return i;
            }
        }

        return -1;
    }
}
