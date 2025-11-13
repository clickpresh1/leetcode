class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        char r = 'a';


        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } 

            set.add(arr[i]);
        } 

        return r;
    }
}
