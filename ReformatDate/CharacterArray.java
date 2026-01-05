class Solution {
    public String reformatDate(String date) {
        int m = date.length();
        char[] res = new char[10];
        res[4] = '-';
        res[7] = '-';
        String[] months = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 

        int i = 0;
        while (Character.isDigit(date.charAt(i))) i++;

        if (i == 2) {
            res[8] = date.charAt(0);
            res[9] = date.charAt(1);
        } else {
            res[8] = '0';
            res[9] = date.charAt(0);
        } 

        i += 3;

        String sub = date.substring(i, i + 3);

        int j = 1;
        for (String s : months) {
            if (s.equals(sub)) break;

            j++; 
        } 

        res[5] = (char) ((j / 10) + '0');
        res[6] = (char) ((j % 10) + '0');

        i += 4;

        res[0] = date.charAt(i++);
        res[1] = date.charAt(i++);
        res[2] = date.charAt(i++);
        res[3] = date.charAt(i);

        return new String(res);
    }
}
