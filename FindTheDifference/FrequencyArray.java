class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int[] freq1 = new int[27];
        int[] freq2 = new int[27];


        for (int i = 0; i < arr1.length; i++) {
            freq1[arr1[i] - 'a' + 1] += 1;
        } 

        for (int i = 0; i < arr2.length; i++) {
            freq2[arr2[i] - 'a' + 1] += 1;
        } 

        char res = 'a';
        for (int i = 1; i < 27; i++) {
            if (freq2[i] == (freq1[i] + 1)) {
                res += (i - 1);
                break;
            }
        } 

        return res;
    }
}
