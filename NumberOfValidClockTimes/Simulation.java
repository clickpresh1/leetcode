class Solution {
    public int countTime(String time) {
        int sum = 0;

        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?') sum += 24;
            else {
                if (time.charAt(1) <= '3') sum += 3;
                else sum += 2;
            }
        } else {
            if (time.charAt(1) == '?') {
                if (time.charAt(0) <= '1') sum += 10;
                else if (time.charAt(0) == '2') sum += 4;
            } 
        } 

        sum = (sum != 0) ? sum : 1;

        if (time.charAt(3) == '?') {
            if (time.charAt(4) == '?') sum *= 60;
            else sum *= 6;
        } else {
            if (time.charAt(4) == '?') sum *= 10;
        } 

        return sum;
    }
}
