import java.util.ArrayList;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int ind = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!(s.charAt(i) == ' ')) {
                ind = i;
                count += 1;
                break;
            }
        } 
        for (int i = ind - 1; i >= 0; i--) {
            if ((s.charAt(i) == ' ')) {
                break;
            } else if (!(s.charAt(i) == ' ')) {
                count += 1;
            }
        }

        return count;
        
    }
}
