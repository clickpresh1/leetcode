class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int m = messages.length, mx = -1;
        String res = null;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int f = wordCount(messages[i]);
            String s = senders[i];
            int g = map.getOrDefault(s, 0) + f;
            map.put(s, g);

            if (g > mx) {mx = g; res = s;}
            else if (g == mx) {
                if (s.compareTo(res) > 0) res = s;
            }
        } 

        return res;
    } 

    public static int wordCount(String s) {
        if (s.length() == 0) return 0;
        
        int cnt = 0;

        for (char c : s.toCharArray()) if (c == ' ') cnt++;

        return ++cnt;
    }
}
