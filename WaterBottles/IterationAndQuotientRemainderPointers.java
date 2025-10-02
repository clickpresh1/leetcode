class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a = numBottles;
        int b = numExchange;

        int maxNumber = a;
        int q = maxNumber / b;
        int rem = maxNumber % b;
        maxNumber += q;
        int curr = q + rem;

        while (curr >= numExchange) {
            q = curr / b;
            rem = curr % b;
            maxNumber += q;
            curr = q + rem;
        } 
        
        return maxNumber;
    }
}
