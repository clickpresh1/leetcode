class Solution {
    public int countHomogenous(String s) {
        int m = s.length(); 
        long cnt = 0;
        char[] arr = s.toCharArray();

        char prev = arr[0];
        int lcCnt = 0;
        for (char c : arr) {
            if (c != prev) {
                lcCnt = 0;
                prev = c;
            } 

            cnt += ++lcCnt;
        } 

        return (int) (cnt % 1000000007);
    }
}
