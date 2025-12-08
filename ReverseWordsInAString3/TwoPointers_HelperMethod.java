class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0, x = 0; i <= arr.length; i++) {
            if ((i == arr.length) || (arr[i] == ' ')) {
                reverse(arr, x, i);
                x = i + 1;
            } 
        } 

        return new String(arr);
    } 

    public static void reverse(char[] arr, int x, int y) {
        for (int i = x, j = 1; i < x + ((y - x) / 2); i++) {
            char temp = arr[i];
            arr[i] = arr[y - j];
            arr[y - j] = temp;
            j++;
        }
    }
}
