class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) return false;

        int x = 0, y = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) x++;
            else if (bills[i] == 10) {
                if (x < 1) return false;
                else {
                    y++;
                    x--;
                }
            } else if (bills[i] == 20) {
                if (y >= 1) {
                    if (x >= 1) {
                        x--;
                        y--;
                    } else return false;
                } else {
                    if (x >= 3) x -= 3;
                    else return false;
                }
            }
        } 

        return true;
    }
}
