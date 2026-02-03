class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();

        list.add(0);

        int bits = 0;

        while (++bits <= n) {
            int len = list.size();

            for (int i = len - 1; i >= 0; i--) {
                int flippedBit = list.get(i) ^ (1 << (bits - 1));

                list.add(flippedBit);
            } 
        }

        return list;
    }
}
