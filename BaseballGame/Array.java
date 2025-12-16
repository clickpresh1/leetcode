class Solution {
    public int calPoints(String[] operations) {
        int[] arr = new int[operations.length];

        for (int i = 0, z = 0; i < operations.length; i++) {
            if (operations[i].charAt(0) == '+') {
                arr[z] = arr[z - 1] + arr[z - 2];
                z++;
            } else if (operations[i].charAt(0) == 'D') {
                arr[z] = arr[z - 1] * 2;
                z++;
            }
            else if (operations[i].charAt(0) == 'C') {
                z -= 1;
                arr[z] = 0;
            } else {
                arr[z] = Integer.valueOf(operations[i]);
                z++;
            }
        } 

        int sum = 0;

        for (int i = 0; i < arr.length; i++) sum += arr[i];

        return sum;
    }
}
