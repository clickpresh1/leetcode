class Solution {
    public List<Integer> grayCode(int n) {
        int[] arr = new int[1 << n];

        int k = 1, bits = 0;
        while (++bits <= n) {
            int len = 1 << (bits - 1);

            for (int i = len - 1; i >= 0; i--) arr[k++] = arr[i] ^ len;
        } 

        List<Integer> list = new ArrayList<>();

        for (int item : arr) list.add(item);

        return list;
    }
}
