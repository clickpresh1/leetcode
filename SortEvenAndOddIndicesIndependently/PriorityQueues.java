class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int m = nums.length;
        Queue<Integer> even = new PriorityQueue<>(), odd = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        } 

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) nums[i] = even.poll();
            else nums[i] = odd.poll();
        } 

        return nums;
    }
}
