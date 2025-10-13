// this solution looks like brute force to me, but i'm not sure

class Solution {
    public static HashMap<Character, char[]> hashMap = new HashMap<>();
    public static char[] arr2 = {'a', 'b', 'c'};
    public static char[] arr3 = {'d', 'e', 'f'};
    public static char[] arr4 = {'g', 'h', 'i'};
    public static char[] arr5 = {'j', 'k', 'l'};
    public static char[] arr6 = {'m', 'n', 'o'};
    public static char[] arr7 = {'p', 'q', 'r', 's'};
    public static char[] arr8 = {'t', 'u', 'v'};
    public static char[] arr9 = {'w', 'x', 'y', 'z'};
    
    public static List<String> letterCombinations(String digits) {
        hashMap.put('2', arr2);
        hashMap.put('3', arr3);
        hashMap.put('4', arr4);
        hashMap.put('5', arr5);
        hashMap.put('6', arr6);
        hashMap.put('7', arr7);
        hashMap.put('8', arr8);
        hashMap.put('9', arr9);

        List<String> list = new ArrayList<>();

        if (digits.length() == 0 || digits.isEmpty()) {
            return list;
        } 

        if (digits.length() == 1) {
            for (int i = 0; i < hashMap.get(digits.charAt(0)).length; i++) {
                list.add("" + hashMap.get(digits.charAt(0))[i]);
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

        hashMap.put('2', arr2);
        hashMap.put('3', arr3);
        hashMap.put('4', arr4);
        hashMap.put('5', arr5);
        hashMap.put('6', arr6);
        hashMap.put('7', arr7);
        hashMap.put('8', arr8);
        hashMap.put('9', arr9);

        int len1 = hashMap.get(a).length;
        int len2 = hashMap.get(b).length;
        for (int i = 0; i < len2; i++) {
            list.add("" + hashMap.get(a)[0] + hashMap.get(b)[i]);
            list.add("" + hashMap.get(a)[1] + hashMap.get(b)[i]);
            list.add("" + hashMap.get(a)[2] + hashMap.get(b)[i]);
            if (2 < len1 - 1) {
                list.add("" + hashMap.get(a)[3] + hashMap.get(b)[i]);
            }
        }
        
        return list;
    } 

    public static List<String> letterCombinations(List<String> list, char b) {
        hashMap.put('2', arr2);
        hashMap.put('3', arr3);
        hashMap.put('4', arr4);
        hashMap.put('5', arr5);
        hashMap.put('6', arr6);
        hashMap.put('7', arr7);
        hashMap.put('8', arr8);
        hashMap.put('9', arr9);

        List<String> listNew = new ArrayList<>();

        int len2 = hashMap.get(b).length;
        for (int i = 0; i < list.size(); i++) {
            listNew.add(list.get(i) + hashMap.get(b)[0]);
            listNew.add(list.get(i) + hashMap.get(b)[1]);
            listNew.add(list.get(i) + hashMap.get(b)[2]);
            if (2 < len2 - 1) {
                listNew.add(list.get(i) + hashMap.get(b)[3]);
            }
        }

        return listNew;
    }
}
