class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int a = numBottles;
        int b = numExchange;

        int maxNumber = a;
        int emptyBottles = a;
    
        while (emptyBottles >= b) {
            maxNumber += 1;
            emptyBottles = emptyBottles - b + 1;
            b += 1;
        }
        
        return maxNumber;
    }
}
