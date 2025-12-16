class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return op(s).equals(op(t));
    } 

    public static int ind(char[] arr, int a) {
        for (int i = a - 1; i >= 0; i--) {
            if (arr[i] != '0') {
                return i;
            }
        } 

        return 0;
    } 

    public static String op(String s) {
        char[] arr = s.toCharArray();

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') x = i;
            else {
                arr[i] = '0';
                if (i > 0) {
                    arr[ind(arr, i)] = '0';
                }
                
            }
        } 

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0') sb.append(arr[i]);
        } 

        return sb.toString();
    }
}
