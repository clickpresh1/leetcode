class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        while (left <= right) {
            if (check(left)) list.add(left);
            left++;
        } 

        return list;
    } 

    public static boolean check(int num) {
        int k = num;
        while (k != 0) {
            if (k % 10 == 0) return false;
            if ((num % (k % 10)) != 0) return false;
            k /= 10;
        } 

        return true;
    }
}
