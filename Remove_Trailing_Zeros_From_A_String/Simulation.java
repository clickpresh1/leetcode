class Solution {
    public String removeTrailingZeros(String num) {
        int m = num.length(), i = m - 1, j = 0;

        while (num.charAt(i) == '0') {
            j++;
            i--;
        } 

        return num.substring(0, i + 1);
    }
}
