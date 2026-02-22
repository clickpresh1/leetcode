class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int x4 = num1 % 10;
        num1 /= 10;
        int x3 = num1 % 10;
        num1 /= 10;
        int x2 = num1 % 10;
        num1 /= 10;
        int x1 = num1 % 10;

        int y4 = num2 % 10;
        num2 /= 10;
        int y3 = num2 % 10;
        num2 /= 10;
        int y2 = num2 % 10;
        num2 /= 10;
        int y1 = num2 % 10;

        int z4 = num3 % 10;
        num3 /= 10;
        int z3 = num3 % 10;
        num3 /= 10;
        int z2 = num3 % 10;
        num3 /= 10;
        int z1 = num3 % 10;

        int a = minVal(x1, y1, z1), b = minVal(x2, y2, z2);
        int c = minVal(x3, y3, z3), d = minVal(x4, y4, z4);

        int res = a;
        res = (res * 10) + b;
        res = (res * 10) + c;

        return (res * 10) + d;
    } 

    public static int minVal(int a, int b, int c) {
        int mn = 10000;

        if (a < mn) mn = a;
        if (b < mn) mn = b;
        if (c < mn) mn = c;

        return mn;
    }
}
