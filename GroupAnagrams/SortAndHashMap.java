import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] strsArr = strs[i].toCharArray();
            Arrays.sort(strsArr);
            String strsStr = new String(strsArr);

            if (!(hashMap.containsKey(strsStr))) {
                hashMap.put(strsStr, new ArrayList<>());
                list.add(hashMap.get(strsStr));
            } 

            hashMap.get(strsStr).add(strs[i]);
        } 

        return list;
    } 
}
