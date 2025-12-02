class Solution {
    public static String Q = "QWERTYUIOPqwertyuiop";
    public static String A = "ASDFGHJKLasdfghjkl";
    public static String Z = "ZXCVBNMzxcvbnm";

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            int x = check(word.charAt(0));

            int count = 1;
            for (int i = 1; i < word.length(); i++) {
                if (check(word.charAt(i)) != x) break;
                else count += 1;
            } 

            if (count == word.length()) list.add(word);
        } 

        String[] arr = new String[list.size()];
        int j = 0;
        for (String word : list) {
            arr[j++] = word;
        } 

        return arr;
    } 

    public static int check(char c) {
        if (Q.indexOf(c) != -1) return 1;
        else if (A.indexOf(c) != -1) return 2;
        else return 3;
    } 
}
