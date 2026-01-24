class Solution {
    public int countPoints(String rings) {
        int m = rings.length();
        int[][] freq = new int[10][3];

        for (int i = 1; i < m; i += 2) {
            char c = rings.charAt(i - 1);
            int k = rings.charAt(i) - '0';

            if (c == 'B') freq[k][0] = 1;
            else if (c == 'G') freq[k][1] = 1;
            else freq[k][2] = 1;
        } 

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if ((freq[i][0] == 1) && (freq[i][0] == freq[i][1]) && freq[i][0] == freq[i][2]) count++;
        } 

        return count;
    }
}
