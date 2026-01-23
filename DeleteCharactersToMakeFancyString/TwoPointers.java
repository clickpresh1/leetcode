class Solution {
    public String makeFancyString(String s) {
        int m = s.length();

        if (m <= 2) return s;

        char[] arr = s.toCharArray();

        int j = 0;
        for (int i = 0; i < m - 2; i++) {
            boolean boo = ((arr[i] == arr[i + 1]) && (arr[i] == arr[i + 2]));

            if (!boo) arr[j++] = arr[i];
        } 

        arr[j++] = arr[m - 2]; arr[j] = arr[m - 1];

        return new String(arr, 0, j + 1);
    }
}
