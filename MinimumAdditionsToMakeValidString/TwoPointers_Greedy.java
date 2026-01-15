class Solution {
    public int addMinimum(String word) {
        int m = word.length(), i = 0, count = 0;

        while (i < m) {
            if (word.charAt(i) == 'a') {
                if (i + 1 < m) {
                    if (word.charAt(i + 1) == 'b') {
                        if (i + 2 < m) {
                            if (word.charAt(i + 2) == 'c') {
                                i += 3;
                            } else {count += 1; i += 2;}
                        } else {count += 1; i += 2;}
                    } else if (word.charAt(i + 1) == 'c') {
                        count += 1;
                        i += 2;
                    } else {count += 2; i += 1;}
                } else {count += 2; i += 1;} 
            } else if (word.charAt(i) == 'b') {
                if (i + 1 < m) {
                    if (word.charAt(i + 1) == 'a') {count += 2; i += 1;}
                    else if (word.charAt(i + 1) == 'c') {
                        count += 1; i += 2;
                    } else {count += 2; i += 1;}
                } else {count += 2; i += 1;}
            } else {count += 2; i += 1;}
        } 

        return count;
    }
}
