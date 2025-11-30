class Solution {
    public boolean checkZeroOnes(String s) {
        char[] arr = s.toCharArray();
        int x0 = 0, x1 = 0, y0 = 0, y1 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '1') {
                x1 += 1;
                if (x1 > y1) y1 = x1;
                x0 = 0;
            } else {
                x0 += 1;
                if (x0 > y0) y0 = x0;
                x1 = 0;
            }
        } 

        if (x0 > y0) y0 = x0;
        if (x1 > y1) y1 = x1;

        return y1 > y0;
    }
}
