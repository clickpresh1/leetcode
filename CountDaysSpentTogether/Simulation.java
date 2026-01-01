class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int month1a = ((arriveAlice.charAt(0) - '0') * 10) + (arriveAlice.charAt(1) - '0');
        int day1a = ((arriveAlice.charAt(3) - '0') * 10) + (arriveAlice.charAt(4) - '0');

        int month1b = ((leaveAlice.charAt(0) - '0') * 10) + (leaveAlice.charAt(1) - '0');
        int day1b = ((leaveAlice.charAt(3) - '0') * 10) + (leaveAlice.charAt(4) - '0');

        int month2a = ((arriveBob.charAt(0) - '0') * 10) + (arriveBob.charAt(1) - '0');
        int day2a = ((arriveBob.charAt(3) - '0') * 10) + (arriveBob.charAt(4) - '0');

        int month2b = ((leaveBob.charAt(0) - '0') * 10) + (leaveBob.charAt(1) - '0');
        int day2b = ((leaveBob.charAt(3) - '0') * 10) + (leaveBob.charAt(4) - '0');

        int a = countDays(month1a, day1a);
        int b = countDays(month1b, day1b);
        int c = countDays(month2a, day2a);
        int d = countDays(month2b, day2b);

        int k = Math.min(b, d);
        int q = Math.max(a, c);

        if (k >= q) return k - q + 1;
        else return 0;
    } 

    public static int countDays(int month, int day) {
        int sum = 0;

        int[] months = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month; i++) sum += months[i];

        sum += day;

        return sum;
    } 
}
