class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        String spt = "[" + separator + "]";
        for (String s : words) {
            String[] spl = s.split(spt);
            for (String t : spl) {
                if (!(t.isEmpty())) list.add(t);
            } 
        } 

        return list;
    }
}
