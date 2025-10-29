class Solution {
    public int numDecodings(String s) {
        int[] arr = new int[s.length() + 1];

        if (s.charAt(0) == '0') return 0;

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            int sum = 0;

            if (s.charAt(i - 1) != '0') sum += arr[i - 1];

            if (s.charAt(i - 2) == '1') {
                sum += arr[i - 2];
            } else if (s.charAt(i - 2) == '2') {
                if ((s.charAt(i - 1) >= '0') && (s.charAt(i - 1) <= '6')) sum += arr[i - 2];
            } 

            arr[i] = sum;
        } 

        return arr[s.length()];
    }
}
