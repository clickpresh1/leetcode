class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        boolean[] booLow = new boolean[27], booCap = new boolean[27], booCounted = new boolean[27];
        int count = 0;

        for (int i = 0, q = 0; i < arr.length; i++) {
            if (arr[i] >= 'a') {
                q = arr[i] - 'a' + 1;
                if (booCounted[q] == true) continue;

                booLow[q] = true;
            } else {
                q = arr[i] - 'A' + 1;
                if (booCounted[q] == true) continue;

                booCap[q] = true;
            } 

            if (booLow[q] == booCap[q]) {
                booCounted[q] = true;
                count++;
            }
        }

        return count;
    }
}
