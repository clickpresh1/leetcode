class Solution {
    public int maximumValue(String[] strs) {
        int m = strs.length, mx = -1;

        for (String s : strs) {
            char[] arr = s.toCharArray();

            int j = 0, res = 0;
            while (j < arr.length) {
                if (arr[j] >= 'a') {res = arr.length; break;}

                res = (res * 10) + (arr[j++] - '0');
            } 

            if (res > mx) mx = res;
        } 

        return mx;
    }
}
