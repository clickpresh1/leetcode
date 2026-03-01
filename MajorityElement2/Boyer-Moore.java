class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m = nums.length, cnt1 = 0, cnt2 = 0, maj1 = 0, maj2 = 1;
        List<Integer> list = new ArrayList<>();

        for (int item : nums) {
            if ((cnt1 > 0) && (item == maj1)) cnt1++;
            else if ((cnt2 > 0) && (item == maj2)) cnt2++;
            else if (cnt1 == 0) {maj1 = item; cnt1++;}
            else if (cnt2 == 0) {maj2 = item; cnt2++;}
            else {cnt1--; cnt2--;}
        } 

        cnt1 = 0; cnt2 = 0;
        for (int item : nums) {
            if (item == maj1) cnt1++;
            else if (item == maj2) cnt2++;
        } 

        if ((cnt1 * 3) > m) list.add(maj1);
        if ((cnt2 * 3) > m) list.add(maj2);

        return list;
    } 
}
