class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int m = num.length, i = m - 1;
        List<Integer> list = new LinkedList<>();

        int carry = 0;
        while ((k > 0) || (i >= 0) || (carry != 0)) {
            int sum = carry;
            
            if (i >= 0) sum += num[i--];

            if (k > 0) sum += (k % 10);

            carry = sum / 10;
            list.addFirst(sum % 10);
            k /= 10;
        } 

        return list;
    }
}
