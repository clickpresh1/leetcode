class Solution {
    public boolean isThree(int n) {
        if (n <= 3) return false;

        if (n % 2 == 0) {
            if (n == 4) return true;
            else return false;
        }

        int count = 2;

        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) count++;

            if (count > 3) return false;
        } 

        return (count == 3) ? true : false;
    }
}
