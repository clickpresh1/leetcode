class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if (names.length == 1) return names;

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        } 

        Arrays.sort(heights);

        for (int i = 0; i < heights.length / 2; i++) {
            int temp = heights[i];
            heights[i] = heights[heights.length - 1 - i];
            heights[heights.length - 1 - i] = temp;
        } 

        for (int i = 0; i < heights.length; i++) {
            names[i] = map.get(heights[i]);
        } 

        return names;
    }
}
