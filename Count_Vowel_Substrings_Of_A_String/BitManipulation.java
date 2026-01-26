class Solution {
    public int countVowelSubstrings(String word) {
        int m = word.length(), count = 0;
        char[] arr = word.toCharArray();

        int vowelBitmask = (1 << 0) | (1 << 4) | (1 << 8) | (1 << 14) | (1 << 20);

        int i = 0;
        while (i < m) {
            if ((vowelBitmask & (1 << (arr[i] - 'a'))) != 0) {
                int locBit = 1 << (arr[i] - 'a');
                int j = i + 1;
                
                while ((j < m) && ((vowelBitmask & (1 << (arr[j] - 'a'))) != 0)) {
                    locBit |= 1 << (arr[j] - 'a');

                    if (vowelBitmask == locBit) count++;

                    j++;
                } 
            } 

            i++;
        } 

        return count;
    }
}
