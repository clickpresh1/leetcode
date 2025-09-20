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


// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int val = 0;
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                char[] subCharArr = sub.toCharArray();
                Set<Character> subSet = new HashSet<>();
                for (Character k : subCharArr) {
                    subSet.add(k);
                } 
                if (subSet.size() == subCharArr.length) {
                    val = subSet.size();
                    output = Math.max(output, val);
                }

            }
        }

        return output; 
    }

}
