//DRAFT
//DRAFT
//DRAFT

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    
    public static boolean isValid(String s) {
        boolean isValid = false;
        boolean isValidChar = false;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((formsAPair(s, i)) || (containsAllPairs(s, i)) || (containsAllPairsReflect(s, i)) || (containsNestedPairs(s, i)) || (containsNestedPairsReflect(s, i))) { //  || ((i + 1 < s.length()) && containsAllPairs(s, i + 1))
                count += 1;
                isValidChar = true;
                // System.out.println(isValidChar);
                
            } else {
                isValidChar = false;
                // System.out.println(isValidChar);
                
            }
        } 
        if (count == s.length()) {
            isValid = true;
        } 

        return isValid;
    } 

    public static int convert(char c) {
        int result = 0;
        switch (c) {
            case '(':
                result = 1;
                break;
            case ')':
                result = 2;
                break;
            case '{':
                result = 3;
                break;
            case '}':
                result = 4;
                break;
            case '[':
                result = 5;
                break;
            case ']':
                result = 6;
                break;
        }

        return result;
    } 

    public static boolean formsAPair(String s, int i) {
        boolean formsAPair = false;
        if ((i + 1 < s.length()) && ((convert(s.charAt(i)) % 2 == 1)) && ((convert(s.charAt(i)) + 1) == convert(s.charAt(i + 1)))) {
            formsAPair = true;
        } else if ((i > 0) && ((convert(s.charAt(i)) % 2 == 0)) && ((convert(s.charAt(i)) - 1) == convert(s.charAt(i - 1)))) {
            formsAPair = true;
        } else if ((i > 0) && ((convert(s.charAt(i)) % 2 == 0)) && ((convert(s.charAt(i)) - 1) != convert(s.charAt(i - 1)))) {
            formsAPair = false;
        }

        return formsAPair;
    } 

    public static boolean containsAllPairs(String s, int i) {
        boolean containsAllPairs = false;
        if ((s.length() >= 4) && (thereExistsLaterReflection(s, i))) {
            int count = 0;
            int ind = reflectIndex(s, i);
            if ((ind - i > 1) && ((convert(s.charAt(i))) % 2 == 1)) {
                for (int j = (i + 1); j < ind; j++) {
                    if (!(formsAPair(s, j))) {
                        break;
                    }
                    if (formsAPair(s, j)) {
                        count += 1;
                    }
                } 
                if (count == (ind - (i + 1))) {
                    containsAllPairs = true;
                }
            } 
            else if (ind + 1 < i) {
                for (int j = (ind + 1); j < i; j++) {
                    if (!(formsAPair(s, j))) {
                        break;
                    } 
                    if (formsAPair(s, j)) {
                        count += 1;
                    }
                } 
                if (count == ((i - 1) - (ind + 1))) {
                    containsAllPairs = true;
                } 
            } 
        }


        return containsAllPairs;
    } 

    public static boolean containsAllPairsReflect(String s, int i) {
        boolean containsAllPairsReflect = false;
        if ((s.length() >= 4) && (thereExistsEarlierReflection(s, i))) {
            int ind = reflectIndex(s, i);
            if ((i > ind) && ((convert(s.charAt(i))) % 2 == 0)) {
                containsAllPairsReflect = containsAllPairs(s, ind);
            }
        }


        return containsAllPairsReflect;
    } 

    public static boolean containsNestedPairs(String s, int i) {
        boolean containsNestedPairs = false;
        if ((s.length() >= 4)  && (thereExistsLaterReflection(s, i))) {
            int count = 0;
            int ind = reflectIndex(s, i);
            if ((ind - i > 1)  && ((convert(s.charAt(i))) % 2 == 1)) {
                for (int j = (i + 1); j < ind; j++) {
                    if ((!(containsAllPairs(s, j))) && (!(containsAllPairsReflect(s, j))) && (!(formsAPair(s, j)))){
                        break;
                    }
                    if (containsAllPairs(s, j) || containsAllPairsReflect(s, j) || formsAPair(s, j)) {
                        count += 1;
                    }
                } 
                if (count == (ind - (i + 1))) {
                    containsNestedPairs = true;
                } 
            } 
        }

        return containsNestedPairs;
    } 

    public static boolean containsNestedPairsReflect(String s, int i) {

        boolean containsNestedPairsReflect = false;
        if ((s.length() >= 4)  && (thereExistsEarlierReflection(s, i))) {
            int ind = reflectIndex(s, i);

            if ((i > ind) && ((convert(s.charAt(i))) % 2 == 0)) {
                containsNestedPairsReflect = containsNestedPairs(s, ind);
            }
        }

        return containsNestedPairsReflect;
    }

    public static char reflect(char c) {
        char result = '\u0000';
        switch (c) {
            case '(':
                result = ')';
                break;
            case '{':
                result = '}';
                break;
            case '[':
                result = ']';
                break;
            case ')':
                result = '(';
                break;
            case '}':
                result = '{';
                break;
            case ']':
                result = '[';
                break;
        } 
        return result;
    } 

    public static int maxIndex(String s, char c) {
        int maxIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        } 
        maxIndex = Collections.max(list);
        return maxIndex;
    } 

    public static int reflectIndex(String s, int i) {
        int reflectIndex = 0;
        // char c = s.charAt(i);
        int indexInList1 = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == s.charAt(i)) {
                if (i == j) {
                    list1.add(j);
                    indexInList1 = list1.size() - 1;
                } else {
                    list1.add(j);
                }
            } else if (s.charAt(j) == reflect(s.charAt(i))) {
                list2.add(j);
            }
        } 

        reflectIndex = list2.get((list2.size() - 1) - indexInList1);

        return reflectIndex;
    } 

    public static boolean thereExistsEarlierReflection(String s, int i) {
        boolean thereExistsEarlierReflection = false;
        int ind = reflectIndex(s, i);
        int count = 0;
        for (int j = 0; j < i; j++) {
            if ((reflect(s.charAt(j)) == s.charAt(i)) && (j == ind)) {
                count += 1;
            }
        } 
        if (count == 1) {
            thereExistsEarlierReflection = true;
        }

        return thereExistsEarlierReflection;
    } 

    public static boolean thereExistsLaterReflection(String s, int i) {
        boolean thereExistsLaterReflection = false;
        int ind = reflectIndex(s, i);
        int count = 0;
        for (int j = (i + 1); j < s.length(); j++) {
            if ((reflect(s.charAt(j)) == s.charAt(i)) && (j == ind)) {
                count += 1;
            }
            
        } 
        if (count == 1) {
            thereExistsLaterReflection = true;
        } 

        return thereExistsLaterReflection;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));

        System.out.println(isValid("([])"));

        System.out.println(isValid("([)]"));
        System.out.println(isValid("(([]){})"));
        System.out.println(isValid("(){}}{"));


        

    }

}
