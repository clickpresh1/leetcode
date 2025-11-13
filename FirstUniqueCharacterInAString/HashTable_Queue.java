class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;;

        Map<Character, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], i);
                q.add(i);
            } else {
                q.remove(map.get(arr[i]));
            }
        } 

        if (q.isEmpty()) return -1;
        else return q.poll();
    }
}
