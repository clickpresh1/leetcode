class Solution {
    public int splitNum(int num) {
        int len = func(num);
        int[] arr = new int[len];

        int w = len - 1, number = num;

        for (int i = len - 1; i >= 0; i--) {
            arr[w--] = number % 10; 

            number /= 10;
        } 

        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
            } 

            if (i % 2 == 0) sum1 = (sum1 * 10) + arr[len - 1 - i];
            else sum2 = (sum2 * 10) + arr[len - 1 - i];
        } 

        return sum1 + sum2;
    } 

    public static int func(int a) {
        if (a < 100) return 2;
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
