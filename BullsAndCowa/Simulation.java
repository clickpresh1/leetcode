class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> cap = new HashMap<>();
        Map<Character, Integer> gap = new HashMap<>(); //i choose the names of the HashMaps to rhyme, not that the names mean anything particularly

        int x = 0;
        int y = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                x += 1;
                if (map.containsKey(secret.charAt(i))) {
                    int val = map.get(secret.charAt(i));
                    map.put(secret.charAt(i), val + 1);
                } else {
                    map.put(secret.charAt(i), 1);
                }
            } else {
                if (cap.containsKey(secret.charAt(i))) {
                    int val = cap.get(secret.charAt(i));
                    cap.put(secret.charAt(i), val + 1);
                } else {
                    cap.put(secret.charAt(i), 1);
                } 
                

                if (gap.containsKey(guess.charAt(i))) {
                    int val = gap.get(guess.charAt(i));
                    gap.put(guess.charAt(i), val + 1);
                } else {
                    gap.put(guess.charAt(i), 1);
                }
            }
        } 

        for (Character ch : cap.keySet()) {
            if (gap.containsKey(ch)) {
                y += Math.min(cap.get(ch), gap.get(ch));
            }
        } 

        return "" + x + "A" + y + "B";
    }
}
