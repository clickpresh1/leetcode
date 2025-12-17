class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" "), str2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        int z = 0;
        
        for (int i = 0; i < str1.length; i++) {
            if (map.containsKey(str1[i])) {
                int val = map.get(str1[i]) + 1;
                if (val == 2) z--;
                map.put(str1[i], val);
            } else {
                map.put(str1[i], 1);
                z++;
            }
        }

        for (int i = 0; i < str2.length; i++) {
            if (map.containsKey(str2[i])) {
                int val = map.get(str2[i]) + 1;
                if (val == 2) z--;
                map.put(str2[i], val);
            } else {
                map.put(str2[i], 1);
                z++;
            }

        } 

        String[] arr = new String[z];

        int k = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 1) arr[k++] = key;
        }

        return arr;
    }
}
