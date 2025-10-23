class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String[] split = path.split("/");
        int n = split.length;
        for (int i = 0; i < n; i++) {
            if (split[i].isEmpty() || split[i].equals(".")) continue;
            if (split[i].equals("..")) {
                if (list.size() > 0) {
                    list.remove(list.size() - 1);
                } 
                continue;
            } 
            list.add(split[i]);
        } 
        if (list.size() > 0) {
            if(list.get(list.size() - 1).equals("/")) list.remove(list.size() - 1);
        } else return "/";
        
        StringBuilder sb = new StringBuilder();
        for (String l : list) {
            sb.append("/");
            sb.append(l);
        }

        return sb.toString();
    }
}
