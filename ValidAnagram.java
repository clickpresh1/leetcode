import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        char[] chArrayS = s.toCharArray();
        char[] chArrayT = t.toCharArray();

        if (Arrays.equals(chArrayS, chArrayT)) {
            isAnagram = true;
        } 

        Arrays.sort(chArrayS);
        Arrays.sort(chArrayT);

        if (Arrays.equals(chArrayS, chArrayT)) {
            isAnagram = true;
        } 

        return isAnagram;
    } 
}
