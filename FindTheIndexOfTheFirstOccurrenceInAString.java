class Solution {
    public static int strStr(String haystack, String needle) {
        int ind = -1;
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        if (lenNeedle <= lenHaystack) {
            int len = (lenHaystack - lenNeedle) + 1;
            for (int i = 0; i < len; i++) {
                String haystackSub = haystack.substring(i, (i + lenNeedle));
                if (haystackSub.equals(needle)) {
                    ind = i;
                    break;
                }
            }
        }

        return ind; 
    }  

}
