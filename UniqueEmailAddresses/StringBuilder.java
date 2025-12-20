class Solution {
    public int numUniqueEmails(String[] emails) {
        int m = emails.length;
        Set<String> set = new HashSet<>(m);
        StringBuilder sb = new StringBuilder();
        

        for (int i = 0; i < m; i++) {
            int n = emails[i].length(), j = 0;
            boolean plus = false, at = false;

            while (j < n) {
                char c = emails[i].charAt(j);

                if (!at) {
                    if (c == '.') {
                        j++;
                        continue;
                    }
                    else if (c == '+') {
                        while (emails[i].charAt(j) != '@') {
                            j++;
                        } 

                        at = true;
                        continue;
                    } else if (c == '@') {
                        at = true;
                        sb.append(c);
                    } else {
                        sb.append(c);
                    }
                } else {
                    sb.append(c);
                } 

                j++;
            }

            set.add(sb.toString());
            sb.setLength(0);
        } 

        return set.size();
    }
}
