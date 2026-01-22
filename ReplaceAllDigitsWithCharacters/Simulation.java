class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        int m = arr.length;

        for (int i = 1; i < m; i += 2) {
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        } 

        return new String(arr);
    }
}
