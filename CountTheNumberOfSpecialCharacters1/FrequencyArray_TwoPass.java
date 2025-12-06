class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        int[] freqLow = new int[27], freqCap = new int[27];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a') freqLow[arr[i] - 'a' + 1]++;
            else freqCap[arr[i] - 'A' + 1]++;
        } 

        for (int i = 1; i < 27; i++) if ((freqCap[i] > 0) && (freqLow[i] > 0)) count++;

        return count;
    }
}
