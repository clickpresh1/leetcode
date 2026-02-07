class Solution {
    public String maximumOddBinaryNumber(String s) {
        int m = s.length(), cnt = 0, k = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < m; i++) {
            if (arr[i] == '1') {cnt++; arr[i] = '0';}
        } 

        arr[m - 1] = '1'; 

        while (--cnt > 0) arr[k++] = '1';

        return new String(arr);
    }
}
