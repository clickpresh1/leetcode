import java.util.ArrayList;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        ArrayList<Character> listAtCharI = new ArrayList<>();
        int count = 0;
        int minLength = minLength(strs);
        String output = "";
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                listAtCharI.add(strs[j].charAt(i));
            } 

            if (!(allEqual(listAtCharI))) {
                break;
            } 

            if (allEqual(listAtCharI)) {
                count += 1;
            }
            listAtCharI.clear();
        } 
        if (count > 0) {
            output = strs[0].substring(0, count);
        }
        
        return output;
    } 

    public static int minLength(String[] strs) {
        int minLength = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        } 

        return minLength;
    } 

    public static boolean allEqual(ArrayList<Character> list) {
        boolean allEqual = false;
        int count = 0;
        char helper = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == helper) {
                count += 1;
            }
        } 
        if (count == list.size()) {
            allEqual = true;
        } 

        return allEqual;
    }

    public static void main(String[] args) {
        String[] strs3 = {"dog","racecar","car"};
        String[] strs = {"flower","flow","flight"};
        String[] strs2 = {"cir", "car"};
        System.out.println(longestCommonPrefix(strs3));
        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix(strs2));
    }
}
