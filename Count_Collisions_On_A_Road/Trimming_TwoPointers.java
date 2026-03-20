class Solution {
    public int countCollisions(String directions) {
        int m = directions.length();
        char[] arr = directions.toCharArray();

        int left = 0;
        while ((left < m) && (arr[left] == 'L')) left++;

        int right = m - 1;
        while ((right >= 0) && (arr[right] == 'R')) right--;

        int cnt = 0;
        for (int k = left; k < right + 1; k++) if (arr[k] != 'S') cnt++;

        return cnt;
    }
}
