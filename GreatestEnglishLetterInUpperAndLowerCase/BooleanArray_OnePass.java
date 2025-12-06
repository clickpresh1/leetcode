class Solution {
    public String greatestLetter(String s) {
        char x = ' ';
        boolean[] booLow = new boolean[27], booCap = new boolean[27];
        char[] arr = s.toCharArray();

        for (int i = 0, q = 0; i < arr.length; i++) {
            if (arr[i] >= 'a') {
                q = arr[i] - 'a' + 1;
                booLow[q] = true;
            } else {
                q = arr[i] - 'A' + 1;
                booCap[q] = true;
            } 

            if (booLow[q] && (booCap[q])) {
                char k = (char) ('A' + q - 1);
                if (k > x) x = k;
            }
        } 

        if (x >= 'A') return "" + x;
        else return "";
    }
}
