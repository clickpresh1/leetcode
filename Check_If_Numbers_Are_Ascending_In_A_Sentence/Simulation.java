class Solution {
    public boolean areNumbersAscending(String s) {
        int m = s.length(), prev = -1, i = 0;
        
        while (i < m) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while ((i < m) && (Character.isDigit(s.charAt(i)))) {
                    num = (num * 10) + (s.charAt(i++) - '0');
                } 

                if (prev < num) prev = num;
                else return false;
            } else i++;
        } 

        return true;
    }
}
