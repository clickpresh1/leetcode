class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int d = 10000;
        double vLog = Math.log10(1000000000);
        double volLog = Math.log10(length) + Math.log10(width) + Math.log10(height);

        boolean bulky = false;
        if (((length >= d) || (width >= d) || (height >= d)) || (volLog >= vLog)) {
            bulky = true;
        } 

        boolean heavy = false;
        if (mass >= 100) {
            heavy = true;
        }

        if ((bulky) && (heavy)) {
            return "Both";
        } else if (bulky) {
            return "Bulky";
        } else if (heavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}
