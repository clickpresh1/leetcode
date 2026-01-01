class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int year1 = ((date1.charAt(0) - '0') * 1000) + ((date1.charAt(1) - '0') * 100) + ((date1.charAt(2) - '0') * 10) + (date1.charAt(3) - '0');
        int month1 = ((date1.charAt(5) - '0') * 10) + (date1.charAt(6) - '0'); 
        int day1 = ((date1.charAt(8) - '0') * 10) + (date1.charAt(9) - '0'); 

        int year2 = ((date2.charAt(0) - '0') * 1000) + ((date2.charAt(1) - '0') * 100) + ((date2.charAt(2) - '0') * 10) + (date2.charAt(3) - '0');
        int month2 = ((date2.charAt(5) - '0') * 10) + (date2.charAt(6) - '0'); 
        int day2 = ((date2.charAt(8) - '0') * 10) + (date2.charAt(9) - '0'); 

        return Math.abs(count(year1, month1, day1) - count(year2, month2, day2));
    } 

    public static int count(int year, int month, int day) {
        int[] months = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        for (int i = 1970; i < year; i++) {
            if (isLeap(i)) sum += 366;
            else sum += 365;
        } 

        if (isLeap(year)) months[2] = 29;

        for (int i = 0; i < month; i++) sum += months[i];

        sum += day;

        return sum;
    } 

    public static boolean isLeap(int year) {

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    } 
}
