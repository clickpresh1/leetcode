class Solution {
    public int numberOfSpecialChars(String word) {
        int[] occLow = new int[27], occCap = new int[27];
        boolean[] booLow = new boolean[27], booCap = new boolean[27];
        char[] arr = word.toCharArray();
        int count = 0;

        for (int i = 0, q = 0; i < arr.length; i++) {
            if (arr[i] >= 'a') {
                q = arr[i] - 'a' + 1;
                occLow[q] = i;
                booLow[q] = true;
            } else {
                q = arr[i] - 'A' + 1;
                if (!booCap[q]) {
                    occCap[q] = i;
                    booCap[q] = true;
                }
            }
        } 

        for (int i = 0; i < 27; i++) {
            if ((occLow[i] < occCap[i]) && ((booCap[i]) && (booLow[i]))) count++;
        } 

        return count;
    }
}
