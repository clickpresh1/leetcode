class Solution {
    public String oddString(String[] words) {
        int m = words.length, len = words[0].length();

        char[] arr = words[0].toCharArray();
        int[] diff1 = new int[len - 1];
        for (int i = 1, j = 0; i < len; i++) {
            diff1[j++] = arr[i] - arr[i - 1];
        } 

        char[] arr2 = words[1].toCharArray();
        int[] diff2 = new int[len - 1];
        for (int i = 1, j = 0; i < len; i++) {
            diff2[j++] = arr2[i] - arr2[i - 1];
        } 

        if (Arrays.equals(diff1, diff2)) {
            int a = 1;
            while (++a < m) {
                char[] str = words[a].toCharArray();
                int[] diffArr = new int[len - 1];
                for (int r = 1, t = 0; r < len; r++) {
                    diffArr[t++] = str[r] - str[r - 1];
                } 

                if (!(Arrays.equals(diff1, diffArr))) return words[a];
            }
        } else {
            char[] str = words[2].toCharArray();
            int[] diffArr = new int[len - 1];
            for (int r = 1, t = 0; r < len; r++) {
                diffArr[t++] = str[r] - str[r - 1];
            } 

            if (!(Arrays.equals(diff1, diffArr))) return words[0];
            else return words[1];
        } 

        return "";
    }
}
