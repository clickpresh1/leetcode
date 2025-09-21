
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int L = 0;
        int output = 0;

        if (s.length() <= 1) {
            output = s.length();
        }

        for (int i = 1; i <= s.length(); i++) {
            String sub = s.substring(L, i);
            char[] arr = sub.toCharArray();
            Set<Character> subSet = new HashSet<>();
            for (char c : arr) {
                subSet.add(c);
            } 
            if (subSet.size() == arr.length) {
                output = Math.max(output, subSet.size());
            } else {
                output = Math.max(output, subSet.size());
                L++;
                String subSub = s.substring(L, i);
                char[] arrSub = subSub.toCharArray();
                Set<Character> subSubSet = new HashSet<>();
                for (Character c : arrSub) {
                    subSubSet.add(c);
                } 
                if (subSubSet.size() == arrSub.length) {
                    output = Math.max(output, subSet.size());
                } else {
                    output = Math.max(output, subSet.size());
                    L++;
                }  
            }     
        }

        return output;
    }

}
