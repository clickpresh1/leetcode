class Solution {
    public String intToRoman(int num) {
        int result = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            if (num >= 1000) {
                int powNum = (int) Math.pow(10, i);
                result = num / powNum;
                sb.append(convert(powNum).repeat(result));
                num = num % powNum;
            } else {
                int powNum = (int) Math.pow(10, i);
                if ((num / powNum) == 0) {
                    continue;
                } else {
                    result = num / powNum;
                    sb.append(convert(result * powNum));
                    num = num % powNum;
                }
                
            }
        }

        return sb.toString();
    } 

    public static String convert(int x) {
        String result = null;
        switch (x) {
            case 1000:
                result = "M";
                break;
            case 900:
                result = "CM";
                break;
            case 500:
                result = "D";
                break;
            case 400:
                result = "CD";
                break;
            case 100:
                result = "C";
                break;
            case 90:
                result = "XC";
                break;
            case 50:
                result = "L";
                break;
            case 40:
                result = "XL";
                break;
            case 10:
                result = "X";
                break;
            case 9:
                result = "IX";
                break;
            case 5:
                result = "V";
                break;
            case 4:
                result = "IV";
                break;
            case 1:
                result = "I";
                break;
        } 

        if ((x >= 1) && (x < 4)) {
            result = "I".repeat(x);
        } 
        if ((x >= 5) && (x < 9)) {
            result = "V" + ("I".repeat(x - 5));
        } 
        if ((x >= 10) && (x < 40)) {
            result = "X".repeat(x / 10);
        } 
        if ((x >= 50) && (x < 90)) {
            result = "L" + "X".repeat((x / 10) - 5);
        } 
        if ((x >= 100) && (x < 400)) {
            result = "C".repeat(x / 100);
        } 
        if ((x >= 500) && (x < 900)) {
            result = "C".repeat((x / 100));
        } 
        if ((x >= 500) && (x < 900)) {
            result = "D" + "C".repeat((x / 100) - 5);
        } 

        return result;
    }
}
