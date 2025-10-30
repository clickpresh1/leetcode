class Solution {
    public int minBitFlips(int start, int goal) {
        int x = 0;

        List<String> list = matchLength(convert(start), convert(goal));

        char[] arr1 = list.get(0).toCharArray();
        char[] arr2 = list.get(1).toCharArray();

        int z = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                arr1[i] = arr2[i];
                z += 1;
            }
        } 

        return z;
    } 

    public static StringBuilder convert(int n) {
        StringBuilder sb = new StringBuilder();
        int rem = n % 2;
        sb.append(rem);

        n = n / 2;

        while (n > 0) {
            rem = n % 2;
            sb.append(rem);

            n = n / 2;
        } 

        rem = n % 2;
        sb.append(rem);

        return sb;
    } 

    public static List<String> matchLength(StringBuilder sb, StringBuilder tb) {
        List<String> list = new ArrayList<>();
        if (sb.length() > tb.length()) {
            int y = sb.length() - tb.length();
            String s = String.valueOf('0').repeat(y);
            tb.append(s);

            list.add(sb.reverse().toString());
            list.add(tb.reverse().toString());
        } else if (sb.length() < tb.length()) {
            int y = tb.length() - sb.length();
            String s = String.valueOf('0').repeat(y);
            sb.append(s);

            list.add(sb.reverse().toString());
            list.add(tb.reverse().toString());
        } else {
            list.add(sb.reverse().toString());
            list.add(tb.reverse().toString());
        } 

        return list;
    }
}
