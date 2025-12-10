class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int m = letters.length, x = 0, y = m - 1, mid = -1;

       if (letters[0] > target) return letters[0];
       if (letters[m - 1] <= target) return letters[0];

        while (x <= y) {
            mid = x + ((y - x) / 2);

            if (letters[mid] == target) break;
            else if (letters[mid] > target) y = mid - 1;
            else x = mid + 1;
        } 

        if (letters[mid] != target) {
            int i = 1;
            while (i < m) {
                if (letters[i] > target) return letters[i];
                i++;
            } 

            return letters[0];
        } else {
            while ((mid < m - 1) && (letters[mid] == target)) mid++;

            return letters[mid];
        }
    } 
}
