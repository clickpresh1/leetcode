class Solution {
    public String reorderSpaces(String text) {
        char[] arr = text.toCharArray();
        char[] res = new char[arr.length];
        int m = arr.length, spaces = 0, words = 0, firstLetter = 0;

        int i = 0;
        while (i < m) {
            if (arr[i] == ' ') {
                spaces++;
                i++;
            }
            else if (arr[i] != ' ') {
                while ((i < m) && (arr[i] != ' ')) {
                    i++;
                } 

                words++;
            } 
        } 

        int pace = (--words == 0) ? spaces : spaces / words;

        for (int j = 0; j < m; j++) {
            if (arr[j] != ' ') {
                firstLetter = j;
                break;
            }
        }

        int q = 0;
        while (firstLetter < m) {
            if (arr[firstLetter] != ' ') {
                while ((firstLetter < m) && (arr[firstLetter] != ' ')) {
                    res[q++] = arr[firstLetter++];
                } 

                int r = 0;
                while ((q < m) && (r < pace)) {
                    res[q++] = ' ';
                    r++;
                } 

            } else firstLetter++;
        } 

        while (q < m) {
            res[q++] = ' ';
        }

        return new String(res);
    }
}
