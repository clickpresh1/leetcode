class Solution {
    public int dayOfYear(String date) {
        int year = ((date.charAt(0) - '0') * 1000) + ((date.charAt(1) - '0') * 100) + ((date.charAt(2) - '0') * 10) + (date.charAt(3) - '0');

        int month = ((date.charAt(5) - '0') * 10) + (date.charAt(6) - '0');
        
        int day = ((date.charAt(8) - '0') * 10) + (date.charAt(9) - '0');

        boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));

        int[] monthArr = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

        if (isLeapYear) monthArr[2] = 29;

        int sum = 0;

        for (int i = 0; i < month; i++) sum += monthArr[i];

        return sum + day;
    }
}
