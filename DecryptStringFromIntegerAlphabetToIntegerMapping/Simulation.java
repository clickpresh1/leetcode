class Solution {
    public String freqAlphabets(String s) {
        int m = s.length();
        char[] str = s.toCharArray(), arr = new char[m];

        int i = m, k = m - 1;
        while (--i >= 0) {
            if (str[i] != '#') {
                arr[k--] = (char) ('a' + (str[i] - '0') - 1);
            } else {
                int q = (str[--i] - '0') + ((str[--i] - '0') * 10);
                arr[k--] = (char) ('a' + q - 1);
            } 
        } 

        return new String(arr, ++k, m - k);
    }
}
