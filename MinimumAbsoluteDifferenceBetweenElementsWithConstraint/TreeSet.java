class Solution {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int m = nums.size(), mn = Integer.MAX_VALUE;
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = x; i < m; i++) {
            set.add(nums.get(i - x));

            int val = nums.get(i);

            Integer fl = set.floor(val), cl = set.ceiling(val);

            int near = (fl == null) ? cl : ((cl == null) ? fl : ((val - fl <= cl - val) ? fl : cl));

            int ab = Math.abs(near - val);

            if (ab < mn) mn = ab;

            if (mn == 0) return 0;
        } 

        return mn;
    }
}
