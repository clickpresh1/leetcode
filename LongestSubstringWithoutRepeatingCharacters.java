// DRAFT
// DRAFT
// DRAFT


class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] sArr = s.toCharArray();
        int firstInd = 0;
        int secondInd = 1;
        int diff = 0;
        int val = 1;
        int output = 0;
        for (int i = 0; i < sArr.length; i++) {
            if ((sArr[i] == sArr[firstInd])) {
                diff = secondInd - firstInd;
                output = Math.max(val, diff);
                firstInd = i;
                secondInd = i + 1;
                
                // secondInd = i;
            } else {
                if (i + 1 < sArr.length) {
                    if (sArr[i + 1] != sArr[i]) {
                        secondInd = i + 1;
                    } else {
                        firstInd = i + 1;
                        secondInd = (i + 1) + 1;
                        continue;
                    }
                } else if (i + 1 == sArr.length) {
                    secondInd = i + 1;
                    diff = secondInd - firstInd;
                    output = Math.max(val, diff);
                }

            }
        

            val = diff;
    }

        return output;
    } 

    public static void main(String[] args) {
        // System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));
    }
}
