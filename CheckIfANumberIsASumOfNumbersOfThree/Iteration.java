class Solution {
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if ((n % 3) == 2) return false; 

            n /= 3;
        } 

        return true;
    }
} 

// the idea is that:
// if n can be represented by a sum of distinct powers of 3,
// n would not have 2 as the result of n % 3
// even as n is iteratively reassigned the value of n / 3


// if n % 3 == 2, that would mean that we have: 
// (3 raised to 0) + (3 raised to 0)
// but that would negate th condition that the operands are distinct
