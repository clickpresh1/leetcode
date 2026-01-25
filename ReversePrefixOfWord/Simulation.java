class Solution {
    public String reversePrefix(String word, char ch) {
        int m = word.length(), indx = -1;
        char[] arr = word.toCharArray();

        for (int i = 0; i < m; i++) {
            if (arr[i] == ch) {indx = ++i; break;}
        } 

        for (int i = 0; i < indx / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[indx - 1 - i];
            arr[indx - 1 - i] = temp;
        } 

        return new String(arr);
    }
}
