class Solution {
    public int subarraySum(int[] nums, int k) {
        int m = nums.length, cnt = 0;

        Map<Integer, List<Integer>> pam = new HashMap<>();

        int runPref = 0;
        for (int i = 0; i < m; i++) {
            runPref += nums[i];
            pam.putIfAbsent(runPref, new ArrayList<>());
            pam.get(runPref).add(i);
        } 

        runPref = 0;
        for (int i = 0; i < m; i++) {
            runPref += nums[i];

            if (runPref == k) cnt++;

            int f = runPref - k;

            if (pam.containsKey(f)) {
                List<Integer> l = pam.get(f);
                int x = 0, y = l.size() - 1;
                while (x <= y) {
                    int mid = x + ((y - x) / 2);

                    if (l.get(mid) < i) x = mid + 1;
                    else y = mid - 1;
                } 

                cnt += x;
            }
        }

        return cnt;
    }
}
