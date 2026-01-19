class Solution {
    public String largestOddNumber(String num) {
        int m = num.length();

        for (int i = m - 1; i >= 0; i--) {
            if ((num.charAt(i) & 1) == 1) return num.substring(0, i + 1);
        } 

        return "";
    }
}
