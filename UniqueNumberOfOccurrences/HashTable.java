class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int n : arr) map.put(n, map.getOrDefault(n, 0) + 1);

        int sum = 0;
        for (int item : map.values()) {
            sum++;
            set.add(item);
        } 

       return sum == set.size();
    }
}
