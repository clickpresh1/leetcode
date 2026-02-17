class Solution {
    public String reverseWords(String s) {
        int m = s.length(), k = 0;
        char[] arr = s.toCharArray(), res = new char[m + 1];

        boolean seenLetter = false;
        int j = m;
        while (--j >= -1) {
            if (seenLetter) {
                int f = j + 1;
                while (--f >= -1) {
                    if ((f < 0) || (arr[f] == ' ')) {
                        if (arr[f + 1] != ' ') {
                            int u = f + 1;
                            while ((u < m) && (arr[u] != ' ')) {
                                res[k++] = arr[u++];
                            } 

                            res[k++] = ' ';
                        } 
                    } 
                } 

                j = f;
                
            } else {
                if (arr[j] != ' ') seenLetter = true;
            }
        }
        
        return new String(res, 0, k - 1);
    }
}
