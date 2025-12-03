class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        char[] arr = num.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] - '0'] += 1;
        } 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - '0' != freq[i]) return false;
        } 

        return true;
    }
}
