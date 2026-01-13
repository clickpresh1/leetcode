class Solution {
    public String reformatNumber(String number) {
        char[] str = number.toCharArray();
        int m = str.length, count = 0;

        for (char c : str) {
            if ((c >= '0') && (c <= '9')) count++;
        } 
        
        if (count % 3 == 0) {
            int len = count + ((count / 3) - 1);
            char[] arr = new char[len];
            int j = len - 1, k = 0;

            for (int i = m - 1; i >= 0; i--) {
                char c = str[i];
                if ((c >= '0') && (c <= '9')) {
                    arr[j--] = c;
                    k++;
                    if ((j > 0) && (k == 3)) {
                        arr[j--] = '-';
                        k = 0;
                    }
                } 
            } 

            return new String(arr);
        } else if (count % 3 == 1) {
            int len = count + (count / 3);
            char[] arr = new char[len];
            int j = len - 1, k = 0;
            boolean firstTwos = false, secondTwos = false;

            for (int i = m - 1; i >= 0; i--) {
                char c = str[i];
                if (!firstTwos) {
                    if ((c >= '0') && (c <= '9')) {
                        arr[j--] = c;
                        k++;
                        if ((j > 0) && (k == 2)) {
                            k = 0;
                            arr[j--] = '-';
                            firstTwos = true;
                        }
                    }
                } else if (!secondTwos) {
                    if ((c >= '0') && (c <= '9')) {
                        arr[j--] = c;
                        k++;
                        if ((j > 0) && (k == 2)) {
                            k = 0;
                            arr[j--] = '-';
                            secondTwos = true;
                        }
                    }
                } else {
                    if ((c >= '0') && (c <= '9')) {
                        arr[j--] = c;
                        k++;
                        if ((j > 0) && (k == 3)) {
                            arr[j--] = '-';
                            k = 0;
                        }        
                    }
                }
            } 

            return new String(arr);
        } else if (count % 3 == 2) {
            int len = count + (count / 3);
            char[] arr = new char[len];
            int j = len - 1, k = 0;
            boolean firstTwos = false;
            for (int i = m - 1; i >= 0; i--) {
                char c = str[i];
                if (!firstTwos) {
                    if ((c >= '0') && (c <= '9')) {
                        arr[j--] = c;
                        k++;
                        if ((j > 0) && (k == 2)) {
                            k = 0;
                            arr[j--] = '-';
                            firstTwos = true;
                        }
                    }
                } else {
                    if ((c >= '0') && (c <= '9')) {
                        arr[j--] = c;
                        k++;
                        if ((j > 0) && (k == 3)) {
                            arr[j--] = '-';
                            k = 0;
                        }        
                    }
                }
            } 

            return new String(arr);
        } 

        return null;
    } 
}
