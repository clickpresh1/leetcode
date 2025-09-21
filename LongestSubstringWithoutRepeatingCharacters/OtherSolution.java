
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        char[] sCharArr = s.toCharArray();
        if (s.length() < 2) {
            output = s.length();
        } 

        int L = 0;
        int R = 0;

        HashMap<Character, Integer> hashmap = new HashMap<>();

        while (R < s.length()) {
            hashmap.put(sCharArr[R], hashmap.getOrDefault(sCharArr[R], 0) + 1);

            while (hashmap.size() != R - L + 1) {
                hashmap.put(sCharArr[L], hashmap.get(sCharArr[L]) - 1);
                if (hashmap.get(sCharArr[L]) == 0) {
                    hashmap.remove(sCharArr[L]);
                } 
                L++;
            } 
            output = Math.max(output, R - L + 1);

            R++;
        } 

        return output; 
    }
}
