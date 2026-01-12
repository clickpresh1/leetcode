class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];

        int i = 0;
        arr[i] = first;

        for (int item : encoded) arr[++i] = arr[i - 1] ^ item; 

        return arr;
    }
}
