class Solution {
    public int differenceOfSum(int[] nums) {
        int sumElement = 0, sumDigit = 0;

        for (int item : nums) {
            sumElement += item;

            while (item > 0) {
                sumDigit += item % 10;
                item /= 10;
            }
        } 

        if (sumElement > sumDigit) return sumElement - sumDigit;
        else return sumDigit - sumElement;
    } 
}
