class Solution {
    public int numDifferentIntegers(String word) {
        int m = word.length();
        Set<String> set = new HashSet<>();

        int i = 0;
        while (i < m) {
            if (word.charAt(i) < 'a') {
                int j = i;
                while ((i < m) && (word.charAt(i) < 'a')) i++;

                int k = j;
                while ((k < m) && (word.charAt(k) == '0')) k++;

                set.add(word.substring(k, i));
            } 

            i++;
        } 

        return set.size();
    }
}
