class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int m = s.length(), x = startPos[0], y = startPos[1];
        char[] arr = s.toCharArray();
        int[] res = new int[m];

        for (int i = 0; i < m; i++) {
            int cnt = 0, f = x, g = y;

            for (int j = i; j < m; j++) {
                if (arr[j] == 'R') g++;
                else if (arr[j] == 'L') g--;
                else if (arr[j] == 'U') f--;
                else if (arr[j] == 'D') f++;

                if ((f >= 0) && (f < n) && (g >= 0) && (g < n)) cnt++;
                else break;
            } 

            res[i] = cnt;
        } 

        return res;
    } 
}
