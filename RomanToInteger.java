class Solution {
    public static int romanToInt(String s) {
        int sum = 0;
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            if (((i + 1) <= (s.length() - 1)) && (convert(s.charAt(i)) < convert(s.charAt(i + 1)))) {
                value = - (convert(s.charAt(i)));
            } else if (((i + 1) <= (s.length() - 1)) && (convert(s.charAt(i)) > convert(s.charAt(i + 1)))) {
                value = convert(s.charAt(i));
            } else if (((i + 1) <= (s.length() - 1)) && (convert(s.charAt(i)) == convert(s.charAt(i + 1)))) {
                value = convert(s.charAt(i));
            } else if (((i + 1) > (s.length() - 1))) {
                value = convert(s.charAt(i));
            } 
            
            sum += value;
        } 
        return sum;
    } 

    public static int convert(char symbol) {
        int value = 0;
        switch (symbol) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        } 

        return value;
    } 
}
