class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        if (score.length == 1) return score;

        Map<Integer, int[]> map = new HashMap<>();
        int[] arr = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            map.put(score[i][k], score[i]);
            arr[i] = score[i][k];
        } 

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        } 

        for (int i = 0; i < arr.length; i++) {
            score[i] = map.get(arr[i]);
        }

        return score;
    }
}
