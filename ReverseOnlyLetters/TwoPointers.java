class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int m = arr.length, x = 0, y = m - 1;

        while (x < y) {
            while ((x < y) && (!Character.isLetter(arr[x]))) x++;

            while ((x < y) && (!Character.isLetter(arr[y]))) y--;

            if ((Character.isLetter(arr[x])) && (Character.isLetter(arr[y]))) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                x++;
                y--;
            }
        } 

        return new String(arr);
    }
}
