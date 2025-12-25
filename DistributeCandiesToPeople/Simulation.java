class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people, i = 0, j = 1, next = j;
        int[] arr = new int[n];

        while ((candies - j) >= 0) {
            arr[i++ % n] += j;

            candies -= j++;
        } 

        arr[i % n] += candies;

        return arr;
    }
}
