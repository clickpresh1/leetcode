class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();

        int k = Math.abs(num);

        while (k!= 0) {
            sb.append(k % 7);
            k /= 7;
        } 

        if (num < 0) sb.append('-');

        return sb.reverse().toString(); 
    }
}
