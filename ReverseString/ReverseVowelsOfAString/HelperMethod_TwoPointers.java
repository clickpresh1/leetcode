class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int x = 0;
        int y = arr.length - 1;

        while (x < y) {
            if ((check(arr[x])) && (check(arr[y]))) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                
                x++;
                y--;
            } else if ((check(arr[x])) && (!(check(arr[y])))) {
                y--;
            } else if ((!(check(arr[x]))) && ((check(arr[y])))) {
                x++;
            } else if ((!(check(arr[x]))) && (!(check(arr[y])))) {
                x++;
                y--;
            }
        } 

        return new String(arr);
    } 

    public static boolean check(char z) {
        if ((z == 'a') || (z == 'e') || (z == 'i') || (z == 'o') || (z == 'u') || (z == 'A') || (z == 'E') || (z == 'I') || (z == 'O') || (z == 'U')) {

            return true;
        } else return false;
    }
}
