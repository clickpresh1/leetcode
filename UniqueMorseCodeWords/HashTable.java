class Solution {
    public static String[] alph = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>(words.length);

        for (String s : words) set.add(transform(s));

        return set.size();
    } 

    public static String transform(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) sb.append(alph[c - 'a']);

        return sb.toString();
    }
}
