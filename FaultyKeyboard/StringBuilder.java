class Solution {
    public String finalString(String s) {
        char[] arr = s.toCharArray();
        int m = arr.length;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (arr[i] == 'i') sb.reverse();
            else sb.append(arr[i]);
        } 

        return sb.toString();
    }
}
