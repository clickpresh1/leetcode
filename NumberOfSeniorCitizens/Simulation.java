class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String s : details) {
            int x = s.charAt(11) - '0', y = s.charAt(12) - '0';

            if (((x * 10) + y) > 60) count++;
        } 

        return count;
    }
}
