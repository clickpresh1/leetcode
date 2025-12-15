class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;

        for (int i = 0; i < m; i++) invertAndFlip(image[i]);

        return image;
    } 

    public static void invertAndFlip(int[] arr) {
        int m = arr.length;

        for (int i = 0; i < m / 2; i++) {
            arr[i] ^= 1;
            arr[m - 1 - i] ^= 1;

            int temp = arr[i];
            arr[i] = arr[m - 1 - i];
            arr[m - 1 - i] = temp;
        } 

        if (m % 2 != 0) arr[m / 2] ^= 1;
    } 
}
