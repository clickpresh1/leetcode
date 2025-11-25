class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.charAt(0);

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        char x = arr1[0];
        x ^= arr2[0];
        for (int i = 1; i < arr1.length; i++) {
            x ^= arr1[i];
            x ^= arr2[i];
        } 

        x ^= arr2[arr2.length - 1];

        return x;
    }
}
