class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int[] a = parse(num1), b = parse(num2);
        int real = (a[0] * b[0]) + (a[1] * b[1] * -1);
        int im = (a[0] * b[1]) + (b[0] * a[1]);

        return new StringBuilder().append(real).append('+').append(im).append('i').toString();
    } 

    public static int[] parse(String num) {
        int real = 0, im = 0, signR = 1, signI = 1;
        boolean plus = false;

        for (char c : num.toCharArray()) {
            if (!plus) {
                if (c != '+') {
                    if (c == '-') signR = -1;
                    else real = (real * 10) + (c - '0');
                }
                else plus = true;
            } else {
                if (c != 'i') {
                    if (c == '-') signI = -1;
                    else im = (im * 10) + (c - '0');
                }
            }
        } 

        real *= signR; im *= signI;

        return new int[] {real, im};
    }
}
