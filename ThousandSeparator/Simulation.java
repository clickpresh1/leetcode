class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);

        sb.reverse();

        int i = 3;

        while (i < sb.length()) {
            sb.insert(i, '.');

            i += 4;
        } 

        return sb.reverse().toString();
    }
}
