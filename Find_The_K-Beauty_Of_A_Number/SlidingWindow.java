class Solution {
    public int divisorSubstrings(int num, int k) {
        int p = 1, count = 0;
        for (int i = 0; i < k; i++) p *= 10;

        int amt = num, q = p / 10;

        while (amt >= q) {
            int res = amt % p;

            if ((res != 0) && (num % res == 0)) count++;

            amt /= 10;
        } 

        return count;
    }
}
