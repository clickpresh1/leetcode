class Solution {
    public int buyChoco(int[] prices, int money) {
        int mn = 101, mn2 = 101;

        for (int item : prices) {
            if (item < mn) {mn2 = mn; mn = item;}
            else if (item < mn2) mn2 = item;
        } 

        int mns = mn + mn2;

        return (money >= mns) ? (money - mns) : money;
    }
}
