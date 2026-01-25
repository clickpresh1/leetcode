class Solution {
    public int maxDistance(int[] colors) {
        int m = colors.length, maxDiff = -1;

        for (int i = 0; i < m; i++) {
            int j = m - 1, x = i, y = m - 1;

            while (j > i) {
                if (colors[i] != colors[j]) {
                    int locDiff = j - i, check = y - x;

                    if ((check == locDiff) && (check > maxDiff)) return check;

                    if (locDiff > maxDiff) maxDiff = locDiff;

                    break;
                } 

                j--;
            } 
        } 

        return maxDiff;
    }
}
