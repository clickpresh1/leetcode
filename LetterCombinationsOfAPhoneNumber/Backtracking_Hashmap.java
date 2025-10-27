class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        backtrack(digits, list, hashMap, new StringBuilder(), 0);

        return list;
    } 

    public static void backtrack(String digits, List<String> list, HashMap<Character, String> hashMap, StringBuilder sb, int x) {
        if (sb.length() == digits.length()) {
            list.add(sb.toString());
            return;
        } else {
            char[] arr = hashMap.get(digits.charAt(x)).toCharArray();
            for (Character ch : arr) {
                sb.append(ch);
                backtrack(digits, list, hashMap, sb, x + 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
