class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int[] freq = new int[1000001];

        for (int item : nums) {
            freq[item]++;

            if ((freq[item] == 2) && (!(list.contains(item)))) list.add(item);
        }

        return list;
    }
}
