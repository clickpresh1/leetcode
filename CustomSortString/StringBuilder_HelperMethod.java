class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            if (s.indexOf(order.charAt(i)) != -1) {
                if (count(s, order.charAt(i)) == 1) {
                    sb.append(order.charAt(i));
                } else if (count(s, order.charAt(i)) > 1) {
                    int val = count(s, order.charAt(i));
                    while (val > 0) {
                        sb.append(order.charAt(i));
                        val -=1;
                    }
                }
            }
        } 

        StringBuilder sc = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().indexOf(s.charAt(i)) == -1) {
                sc.append(s.charAt(i));
            } else {
                j += 1;
            }
        } 

        sb.append(sc);

        return sb.toString();
    } 

    public static int count(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count += 1;
            }
        } 

        return count;
    }
}
