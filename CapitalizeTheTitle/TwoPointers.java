class Solution {
    public String capitalizeTitle(String title) {
        char[] arr = title.toCharArray();
        int m = arr.length;

        for (int i = 0, x = 0; i <= m; i++) {
            if ((i == m) || (arr[i] == ' ')) {
                if ((i - x) > 2) arr[x] = Character.toUpperCase(arr[x]);

                x = i + 1;
            } else arr[i] = Character.toLowerCase(arr[i]);
        } 

        return new String(arr);
    } 
}
