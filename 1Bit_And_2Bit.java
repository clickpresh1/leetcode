class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean boo = false;
        int x = 0;
        int i = 0;
        while (i < bits.length) {
            if (bits[i] != 0) {
                boo = false;
                if (i + 1 >= bits.length) return false;
                else x = (bits[i] * 10) + bits[i + 1];
                
                if ((x == 10) || (x == 11)) {
                    i += 2;
                }
            } else {
                boo = true;
                i += 1;
            }
        } 

        return boo;
    }
}
