class Solution {
    public String defangIPaddr(String address) {
        int m = address.length(), k = 0;

        for (int i = 0; i < m; i++) {
            if (address.charAt(i) == '.') k += 3;
            else k++;
        } 

        char[] arr = new char[k];

        int j = 0, q = 0;
        while (j < m) {
            if (address.charAt(j) == '.') {
                arr[q++] = '[';
                arr[q++] = '.';
                arr[q] = ']';
            } else arr[q] = address.charAt(j);

            j++;
            q++;
        }

        return new String(arr);
    }
}
