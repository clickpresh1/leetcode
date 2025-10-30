class Solution {
    public int minBitFlips(int start, int goal) {
        char[] arr1 = convert(start).toCharArray();
        char[] arr2 = convert(goal).toCharArray();

        int z = 0;
        int m = arr1.length;
        int n = arr2.length;

        if (m == n) {
            int i = m - 1;
            while (i >= 0) {
                if (arr1[i] != arr2[i]) z += 1;
                
                i -= 1;
            } 

            return z;
        } else if (m > n) {
            int i = m - 1;
            while (i >= 0) {
                if (n > 0) {
                    if (arr1[m - 1] != arr2[n - 1]) z += 1;
                } else if (n == 0) {
                    if (arr1[m - 1] != arr2[0]) z += 1;
                } else {
                    if (arr1[m - 1] != '0') z += 1;
                } 

                m -= 1;
                n -= 1;
                i -= 1;
            } 

            return z;
        } else {
            int i = n - 1;
            while(i >= 0) {
                if (m > 0) {
                    if (arr1[m - 1] != arr2[n - 1]) z += 1;
                } else if (m == 0) {
                    if (arr1[0] != arr2[n - 1]) z += 1;
                } else {
                    if (arr2[n - 1] != '0') z += 1;
                } 

                m -= 1;
                n -= 1;
                i -= 1;
                
            } 

            return z;
        }
        
    } 

    public static String convert(int n) {
        StringBuilder sb = new StringBuilder();
        int rem = n % 2;
        sb.append(rem);

        n = n / 2;

        while (n > 0) {
            rem = n % 2;
            sb.append(rem);

            n = n / 2;
        } 

        rem = n % 2;
        sb.append(rem);

        sb.reverse();

        return sb.toString();
    } 
}Brute
