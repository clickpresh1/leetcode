class Solution {
    public String finalString(String s) {
        char[] arr = s.toCharArray();
        int m = arr.length, c = m;

        for (int i = 0, z = 0; i < m; i++) {
            if (arr[i] == 'i') {
                c--;
                int k = 0, q = z;
                while (k < q) {
                    while ((k < q) && (arr[k] == 'i')) k++;

                    while ((k < q) && (arr[q] == 'i')) q--;

                    if ((arr[k] != 'i') && (arr[q] != 'i')) {
                        char temp = arr[k];
                        arr[k] = arr[q];
                        arr[q] = temp;
                        k++;
                        q--;
                    }
                } 
            } else z = i;
        } 

        char[] arr2 = new char[c];
        for (int i = 0, j = 0; i < m; i++) {
            if (arr[i] != 'i') arr2[j++] = arr[i];
        } 

        return new String(arr2);
    }
}
