class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int m = items.size(), count = 0, c = -1;

        if (ruleKey.equals("type")) c = 0;
        else if (ruleKey.equals("color")) c = 1;
        else c = 2;

        for (int i = 0; i < m; i++) {
            if (items.get(i).get(c).equals(ruleValue)) count++;
        }

        return count;
    }
}
