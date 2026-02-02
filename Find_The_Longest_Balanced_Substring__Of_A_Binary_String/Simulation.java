class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int m = s.length(), mx = 0;
        char[] arr = s.toCharArray();

        int i = 0;
        while (i < m) {
            int zeroCount = 0, oneCount = 0, count = 0;

            if (arr[i] == '0') {
                zeroCount++; i++;
                while ((i < m) && (arr[i] == '0')) {
                    zeroCount++; i++;
                } 

                while ((i < m) && (arr[i] == '1')) {
                    oneCount++; i++;
                } 

                count = (zeroCount == oneCount) ? (2 * zeroCount) : 2 * Math.min(zeroCount, oneCount);

                if (count > mx) mx = count;
            } else i++;
        } 

        return mx;
    }
}
