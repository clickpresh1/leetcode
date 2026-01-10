class Solution {
    public String maximumTime(String time) {
        char[] arr = new char[5];
        arr[2] = ':';

        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?') {
                arr[0] = '2';
                arr[1] = '3';
            } else {
                arr[1] = time.charAt(1);
                if (time.charAt(1) <= '3') arr[0] = '2';
                else arr[0] = '1';
            }
        } else {
            arr[0] = time.charAt(0);
            if (time.charAt(1) == '?') {
                if (time.charAt(0) < '2') arr[1] = '9';
                else if (time.charAt(0) == '2') arr[1] = '3';
            } else arr[1] = time.charAt(1);
        } 

        if (time.charAt(3) == '?') {
            arr[3] = '5';
            if (time.charAt(4) == '?') arr[4] = '9';
            else arr[4] = time.charAt(4);
        } else {
            arr[3] = time.charAt(3);
            arr[4] = (time.charAt(4) == '?') ? '9' : time.charAt(4);
        }

        return new String(arr);
    } 
}
