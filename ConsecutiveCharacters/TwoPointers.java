class Solution {
    public int maxPower(String s) {
        char x = s.charAt(0);
        int y = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x) {
                y += 1;
            } else {
                z = Math.max(y, z);
                x = s.charAt(i);
                y = 1;
            } 
        } 

        z = Math.max(y, z);

        return z;
    }
}
