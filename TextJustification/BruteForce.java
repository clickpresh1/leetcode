class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();
        int m = words.length;
        int count = 0;
        int i = 0;
        while (count < m) {
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            count += 1;
            i += 1;
            int n = 0;
            int x = sb.length();
            int r = i;
            while((x <= maxWidth) && (r < m)) {
                if (x + 1 + words[r].length() > maxWidth) break;
                    x += 1 + words[r].length();
                    n += 1;
                    r += 1;
            } 

            int y = maxWidth - x;
            if (n == 0) {
                String fillStr = " ".repeat(y);
                sb.append(fillStr);
            } else {
                if (r == m) {
                    String[] arr = new String[n];
                    Arrays.fill(arr, " ");

                    int z = 0;
                    while (z < n) {
                        sb.append(arr[z]);
                        sb.append(words[i]);
                        count += 1;
                        z += 1;
                        i += 1;
                    } 
                    sb.append(" ".repeat(y));
                } else {
                    String[] arr = new String[n];
                    String fillStr = " ".repeat((y / n) + 1);
                    Arrays.fill(arr, fillStr);
                    if (y % n != 0) {
                        int j = 0;
                        while (j < (y % n)) {
                            arr[j] += " ";
                            j += 1;
                        } 
                    } 

                    int z = 0;
                    while (z < n) {
                        sb.append(arr[z]);
                        sb.append(words[i]);
                        count += 1;
                        z += 1;
                        i += 1;
                    }
                }
            } 

            list.add(sb.toString());
        } 

        return list;
    } 
}
