class Solution {
    public int minCostToMoveChips(int[] position) {
        int countEven = 0, countOdd = 0;

        for (int pos : position) {
            if ((pos & 1) == 0) countEven++;
            else countOdd++;
        } 

        return (countEven < countOdd) ? countEven : countOdd;
    }
} 

// i was able to solbve this, bit i'm not sure i'll be able to solve this problem this good time next time... there's still some thing about it that eludes me...

