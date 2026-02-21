class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int m = height.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < m; i++) {
            if (height[i - 1] > threshold) list.add(i);
        } 

        return list;
    }
}
