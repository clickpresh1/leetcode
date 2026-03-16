class Solution {
    public int numSub(String s) {
        int m = s.length();
        long cnt = 0;

        int lcCnt = 0;
        for (char c : s.toCharArray()) {
            if (c != '1') lcCnt = 0;
            else cnt += ++lcCnt;
        } 

        return (int) (cnt % 1000000007);
    }
}
