class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            if (!Character.isLetter(paragraph.charAt(i))) {
                if (!sb.isEmpty()) {
                    String s = sb.toString();

                    if (!map.containsKey(s)) map.put(s, 1);
                    else {
                        int val = map.get(s);
                        map.put(s, val + 1);
                    }
                    sb.setLength(0);
                }
            } else sb.append(Character.toLowerCase(paragraph.charAt(i)));
        } 

        if (!sb.isEmpty()) {
            String s = sb.toString();

            if (!map.containsKey(s)) map.put(s, 1);
            else {
                int val = map.get(s);
                map.put(s, val + 1);
            }
        }

        for (int i = 0; i < banned.length; i++) {
            if (map.containsKey(banned[i])) map.remove(banned[i]);
        } 

        int maxVal = Integer.MIN_VALUE;
        String k = null;
        for (String key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxVal = map.get(key);
                k = key;
            }
        } 

        return k;
    }
}
