class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] sp = s.split(" ");

        if (pattern.length() != sp.length) return false;
        
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!(map.get(pattern.charAt(i)).equals(sp[i]))) {
                    return false;
                }
            } else {
                if (map.containsValue(sp[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), sp[i]);
                }
            }
        } 

        return true;
    }
}
