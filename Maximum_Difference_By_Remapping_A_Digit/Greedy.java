class Solution {
    public int minMaxDifference(int num) {
        int l = len(num);
        int[] arr1 = new int[l], arr2 = new int[l];

        int number = num, x = l - 1;
        while (number > 0) {
            arr1[x] = number % 10;
            arr2[x--] = number % 10;

            number /= 10;
        } 

        int i = -1, replaceDigitMax = -1;
        while (++i < l) {
            if (arr1[i] != 9) {
                replaceDigitMax = arr1[i];
                break;
            } 
        } 

        int j = -1, replaceDigitMin = -1;
        while (++j < l) {
            if (arr1[j] != 0) {
                replaceDigitMin = arr1[j];
                break;
            } 
        } 

        if (replaceDigitMax != -1) {
            for (int u = 0; u < l; u++) {
                if (arr1[u] == replaceDigitMax) arr1[u] = 9;
            }
        } 

        if (replaceDigitMin != -1) {
            for (int v = 0; v < l; v++) {
                if (arr2[v] == replaceDigitMin) arr2[v] = 0;
            }
        } 

        int mx = 0, mn = 0;
        for (int v = 0; v < l; v++) {
            mx = (mx * 10) + arr1[v];
            mn = (mn * 10) + arr2[v];
        } 

        return mx - mn;
    } 

    public static int len(int a) {
        if (a < 10) return 1;
        else if (a < 100) return 2;
        else if (a < 1000) return 3;
        else if (a < 10000) return 4;
        else if (a < 100000) return 5;
        else if (a < 1000000) return 6;
        else if (a < 10000000) return 7;
        else if (a < 100000000) return 8;
        else if (a < 1000000000) return 9;
        else return 10;
    }
}
