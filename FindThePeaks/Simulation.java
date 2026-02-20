class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        int m = mountain.length;
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int prev = mountain[i];
        while (++i < m - 1) {
            int curr = mountain[i], next = mountain[i + 1];

            if ((curr > prev) && (curr > next)) {
                list.add(i);
                prev = next;
                i++; 
            } else prev = curr;
        }

        return list;
    }
}
