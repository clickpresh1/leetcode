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
    
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0 || digits.isEmpty()) {
            return list;
        } 

        if (digits.length() == 1) {
            for (int i = 0; i < HASHMAP.get(digits.charAt(0)).length; i++) {
                list.add("" + HASHMAP.get(digits.charAt(0))[i]);
            } 

            return list;
        } 

        if (digits.length() == 2) {
            return letterCombinations(digits.charAt(0), digits.charAt(1));            
        } 

        if (digits.length() > 2) {
            List<String> listReuse = letterCombinations(digits.charAt(0), digits.charAt(1));
            for (int i = 2; i < digits.length(); i++) {
                letterCombinations(listReuse, digits.charAt(i));
                listReuse = letterCombinations(listReuse, digits.charAt(i));
            } 

            return listReuse;
        }

        return new ArrayList<>();
    } 

    public static List<String> letterCombinations(char a, char b) {
        List<String> list = new ArrayList<>();

        int len1 = HASHMAP.get(a).length;
        int len2 = HASHMAP.get(b).length;
        for (int i = 0; i < len2; i++) {
            list.add("" + HASHMAP.get(a)[0] + HASHMAP.get(b)[i]);
            list.add("" + HASHMAP.get(a)[1] + HASHMAP.get(b)[i]);
            list.add("" + HASHMAP.get(a)[2] + HASHMAP.get(b)[i]);
            if (2 < len1 - 1) {
                list.add("" + HASHMAP.get(a)[3] + HASHMAP.get(b)[i]);
            }
        }
        
        return list;
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
