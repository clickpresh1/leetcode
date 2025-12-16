class Solution {
    public int minOperations(String[] logs) {
        String a = "../", b = "./", c = "x/";

        int x = -1;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals(a)) {
                if (x > - 1) x--;
                else x = -1;
            } else if (logs[i].equals(b)) continue;
            else if (logs[i].equals(c)) x++;
            else x++;
        } 

        return x + 1;
    } 
}
