class Solution {
    public String interpret(String command) {
        int m = command.length(), i = 0;

        StringBuilder sb = new StringBuilder();

        while (i < m) {
            if (command.charAt(i) == 'G') sb.append('G');
            else if (command.charAt(i++) == '(') {
                if (command.charAt(i) == ')') sb.append('o');
                else {
                    sb.append('a').append('l');
                    i += 2;
                }
            } 

            i++;
        } 

        return sb.toString();
    }
}
