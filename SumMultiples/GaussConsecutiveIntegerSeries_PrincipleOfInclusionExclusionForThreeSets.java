class Solution {
    public int sumOfMultiples(int n) {
        /*
        Gauss' consecutive integer series formula:
        1 + 2 + 3 + ... + n = ((n * (n + 1)) / 2)

        Principle of Inclusion-Exclusion for three sets:
        n(A u B u C) = n(A) + n(B) + n(C) - n(A n B) - n(A n C) - n(B n C) + n(A n B n C)
        */
        
        int sum = 0;
        sum += 3 * (((n / 3) * ((n / 3) + 1)) / 2);
        sum += 5 * (((n / 5) * ((n / 5) + 1)) / 2);
        sum += 7 * (((n / 7) * ((n / 7) + 1)) / 2);
        sum -= 15 * (((n / 15) * ((n / 15) + 1)) / 2);
        sum -= 21 * (((n / 21) * ((n / 21) + 1)) / 2);
        sum -= 35 * (((n / 35) * ((n / 35) + 1)) / 2);
        sum += 105 * (((n / 105) * ((n / 105) + 1)) / 2);
        
        return sum;
    }
}
