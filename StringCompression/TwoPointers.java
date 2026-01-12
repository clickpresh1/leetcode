class Solution {
    public int compress(char[] chars) {
        int m = chars.length, i = 0, j = 0, outCount = 0;

        while (i < m) {
            char c = chars[i];

            int inCount = 0;
            while ((i < m) && (chars[i] == c)) {
                inCount++;
                i++;
            } 

            chars[j++] = c;

            if (inCount == 1) outCount += 1;
            else if (inCount > 1) {
                int k = 0, f = j;
                while (inCount > 0) {
                    chars[j++] = (char) ((inCount % 10) + '0');
                    k++;
                    inCount /= 10;
                } 

                for (int a = f, q = 0; a < f + (k / 2); a++, q++) {
                    char temp = chars[a];
                    chars[a] = chars[f + k - 1 - q];
                    chars[f + k - 1 - q] = temp;
                } 

                outCount += k + 1;
            }
        } 

        return outCount;
    }
}
