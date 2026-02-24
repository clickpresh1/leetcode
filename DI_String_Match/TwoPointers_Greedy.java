class Solution {
    public int[] diStringMatch(String s) {
        int m = s.length(), x = 0, y = m, k = 0;
        int[] arr = new int[m + 1];

        for (char c : s.toCharArray()) {
            if (c == 'I') arr[k++] = x++;
            else arr[k++] = y--; 
        } 

        arr[k] = x;

        return arr;
    }
}
