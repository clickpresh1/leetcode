class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        int m = arr.length;
        char[] alph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        if (arr[0] == '?') {
            if (m == 1) return "a";
            else {
                int j = 0;
                while (j < 26) {
                    if (alph[j] == arr[1]) j++;
                    else break;
                } 

                arr[0] = alph[j];
            }
        } 

        for (int i = 1; i < m - 1; i++) {
            if (arr[i] == '?') {
                int j = 0;
                while (j < 26) {
                    if ((alph[j] == arr[i - 1]) || (alph[j] == arr[i + 1])) j++;
                    else break;
                } 

                arr[i] = alph[j];
            } 
        } 

        if (arr[m - 1] == '?') {
            int j = 0;
            while (j < 26) {
                if (alph[j] == arr[m - 2]) j++;
                else break;
            } 

            arr[m - 1] = alph[j];
        } 

        return new String(arr);
    }
}
