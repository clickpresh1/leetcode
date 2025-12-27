class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] monthArr = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dOW = 5;
        
        for (int i = 1971; i < year; i++, dOW++) if (isLeap(i)) dOW++;

        if (isLeap(year)) monthArr[2] = 29;

        for (int i = 0; i < month; i++) dOW += monthArr[i];

        dOW += --day;

        String[] dayArr = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return dayArr[dOW % 7];
    } 

    public static boolean isLeap(int year) {
        
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
