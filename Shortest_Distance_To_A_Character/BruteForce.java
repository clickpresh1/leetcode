class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) == c) list.add(i);

        for (int i = 0; i < arr.length; i++) arr[i] = check(list, i);

        return arr;
    } 

    public static int check(List<Integer> list, int a) {
        int min = Integer.MAX_VALUE;

        for (int item : list) {
            int val = a - item;
            if (val < 0) val *= -1;
            if (val < min) min = val;
        } 

        return min;
    }
}
