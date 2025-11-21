class Solution {
    public String getHint(String secret, String guess) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>(); 

        int x = 0;
        int y = 0;
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                x += 1;
            } else {
                if (map1.containsKey(secret.charAt(i))) {
                    int val = map1.get(secret.charAt(i));
                    map1.put(secret.charAt(i), val + 1);
                } else {
                    map1.put(secret.charAt(i), 1);
                } 


                if (map2.containsKey(guess.charAt(i))) {
                    int val = map2.get(guess.charAt(i));
                    map2.put(guess.charAt(i), val + 1);
                } else {
                    map2.put(guess.charAt(i), 1);
                }
            }
        } 

        for (Character ch : map1.keySet()) {
            if (map2.containsKey(ch)) {
                y += Math.min(map1.get(ch), map2.get(ch));
            }
        } 

        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.append("A");
        sb.append(y);
        sb.append("B");

        return sb.toString();
    }
}
