class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] booLow = new boolean[27], booCap = new boolean[27];
        int[] counted = new int[27];
        char[] arr = word.toCharArray();
        int count = 0;

        for (int i = 0, q = 0; i < arr.length; i++) {

            if (arr[i] >= 'a') {
                q = arr[i] - 'a' + 1;

                if (counted[q] == 1) {
                    count--;
                    counted[q] = 2;
                    continue;
                } else if (counted[q] == 2) continue;

                booLow[q] = true;
            } else {
                q = arr[i] - 'A' + 1;

                if (counted[q] == 0) {
                    if (!booLow[q]) {
                        booCap[q] = true;
                        counted[q] = 2;
                        continue;
                    } else booCap[q] = true;
                } else continue;
            } 

            if (booLow[q] == booCap[q]) {
                count++;
                counted[q] = 1;
            } 
        } 

        return count;
    }
}
