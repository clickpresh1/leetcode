class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if ((i == 0) && (digits[i] == 0)) continue;
            if ((i > 0) && (digits[i] == 0) && (digits[i] == digits[i - 1])) continue;
            int sum1 = 0;
            sum1 = (sum1 * 10) + digits[i];
            for (int j = 0; j < digits.length; j++) {
                if (i == j) continue;
                int sum2 = sum1;
                sum2 = (sum2 * 10) + digits[j];
                for (int k = 0; k < digits.length; k++) {
                    if ((j == k) || (i == k)) continue;
                    int sum3 = sum2;
                    sum3 = (sum3 * 10) + digits[k];
                    if ((sum3 >= 100) && (sum3 <= 999)) {
                        if ((sum3 % 2) == 0) set.add(sum3);
                    }
                } 
            } 

            
        }
        
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer d : set) {
            arr[i] = d;
            i += 1;
        } 

        Arrays.sort(arr);

        return arr;
    }
}
