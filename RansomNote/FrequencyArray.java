class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;

        int[] freq = new int[27];
        char[] arr2 = ransomNote.toCharArray();
        char[] arr3 = magazine.toCharArray();

        for (int i = 0; i < arr3.length; i++) {
            freq[arr3[i] - 'a' + 1] += 1;
        } 

        for (int i = 0; i < arr2.length; i++) {
            if (freq[arr2[i] - 'a' + 1] == 0) return false;
            else {
                freq[arr2[i] - 'a' + 1] -= 1;
            } 
        } 

        return true;
    }
}
