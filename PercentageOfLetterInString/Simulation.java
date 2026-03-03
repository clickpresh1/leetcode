class Solution {
    public int percentageLetter(String s, char letter) {
        int m = s.length(), cnt = 0;
        char[] arr = s.toCharArray();

        for (char c : arr) if (c == letter) cnt++;

        return (cnt * 100) / m;
    }
}
