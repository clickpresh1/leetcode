class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int m = s.length(), t = 0, count = 0, i = 0;
        char[] arr = s.toCharArray();

        while (i < m) {
            t = 0;

            while ((i < m) && (t + widths[arr[i] - 'a'] <= 100)) {
                t += widths[arr[i++] - 'a'];
            } 
            
            count++;
        } 

        return new int[] {count, t};
    }
}
