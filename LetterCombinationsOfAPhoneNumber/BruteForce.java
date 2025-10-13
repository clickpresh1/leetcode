// this solution looks like brute force to me, but i'm not sure

class Solution {
    public static final Map<Character, char[]> HASHMAP = Map.ofEntries(
        Map.entry('2', new char[] {'a', 'b', 'c'}),
        Map.entry('3', new char[] {'d', 'e', 'f'}),
        Map.entry('4', new char[] {'g', 'h', 'i'}),
        Map.entry('5', new char[] {'j', 'k', 'l'}),
        Map.entry('6', new char[] {'m', 'n', 'o'}),
        Map.entry('7', new char[] {'p', 'q', 'r', 's'}),
        Map.entry('8', new char[] {'t', 'u', 'v'}),
        Map.entry('9', new char[] {'w', 'x', 'y', 'z'})
    ); 
    
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0 || digits.isEmpty()) {
            return list;
        } 

        if (digits.length() == 1) {
            for (int i = 0; i < HASHMAP.get(digits.charAt(0)).length; i++) {
                list.add(String.valueOf(HASHMAP.get(digits.charAt(0))[i]));
            } 

            return list;
        } 

        String dig = String.valueOf(digits.charAt(0));
        List<String> listReuse = letterCombinations(dig);
        for (int i = 1; i < digits.length(); i++) {
            letterCombinations(listReuse, digits.charAt(i));
            listReuse = letterCombinations(listReuse, digits.charAt(i));
        } 

        return listReuse;
    } 

    public static List<String> letterCombinations(List<String> list, char b) {
        List<String> listNew = new ArrayList<>();

        int len2 = HASHMAP.get(b).length;
        for (int i = 0; i < list.size(); i++) {
            listNew.add(list.get(i) + HASHMAP.get(b)[0]);
            listNew.add(list.get(i) + HASHMAP.get(b)[1]);
            listNew.add(list.get(i) + HASHMAP.get(b)[2]);
            if (2 < len2 - 1) {
                listNew.add(list.get(i) + HASHMAP.get(b)[3]);
            }
        }

        return listNew;
    } 
}
