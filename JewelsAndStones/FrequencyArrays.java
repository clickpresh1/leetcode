class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelsArr = jewels.toCharArray(), stonesArr = stones.toCharArray();
        int[] freqLow = new int[27], freqUpp = new int[27];
        int count = 0;

        for (int i = 0; i < jewelsArr.length; i++) {
            if (jewelsArr[i] >= 'a') freqLow[jewelsArr[i] - 'a' + 1]++;
            else freqUpp[jewelsArr[i] - 'A' + 1]++;
        } 

        for (int i = 0; i < stonesArr.length; i++) {
            if (stonesArr[i] >= 'a') {
                if (freqLow[stonesArr[i] - 'a' + 1] > 0) count++;
            } else if (freqUpp[stonesArr[i] - 'A' + 1] > 0) count++;
        } 

        return count;
    }
}
