class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (!(map.containsKey(magazine.charAt(i)))) {
                map.put(magazine.charAt(i), 1);
            } else {
                int val = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), val + 1);
            } 
        } 

        for (int i = 0; i < ransomNote.length(); i++) {
            if ((!(map.containsKey(ransomNote.charAt(i)))) || (map.get(ransomNote.charAt(i)) == 0)) {
                return false;
            } else {
                
                int val = map.get(ransomNote.charAt(i));
                map.put(ransomNote.charAt(i), val - 1);
            } 
        } 

        return true;
    }
}
