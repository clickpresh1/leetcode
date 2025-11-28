class Solution {
    public int countSegments(String s) {
        if (s.isEmpty()) return 0;

        char k = s.charAt(0);
        
        int count = (k != ' ') ? 1 : 0;

        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i) != ' ') && (k == ' ')) {
                count += 1;
            } 

            k = s.charAt(i);
        } 

        return count;
    }
}
