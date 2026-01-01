class Solution {
    public int convertTime(String current, String correct) {
        int a = convert(current);
        int b = convert(correct);

        int c = b - a, count = 0;
        
        count += c / 60;
        c %= 60;

        count += c / 15;
        c %= 15;

        count += c / 5;
        c %= 5;

        count += c;

        return count;
    } 

    public static int convert(String s) {
        int sum = 0;

        int a = ((s.charAt(0) - '0') * 10) + (s.charAt(1) - '0');
        int b = ((s.charAt(3) - '0') * 10) + (s.charAt(4) - '0');

        sum += (a * 60) + b;

        return sum;
    }
}
