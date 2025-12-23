class Solution {
    public String[] findOcurrences(String text, String first, String second) {

        String[] spl = text.split(" ");
        int m = spl.length;
        String[] arr = new String[m];

        boolean f = false, s = false;
        int j = 0;

        for (int i = 0; i < m; i++) {
            if (f && s) {
                arr[j++] = spl[i];
                if (!(spl[i].equals(first))) {
                    f = false;
                }

                s = false;
                
                if ((spl[i - 1].equals(first)) && (spl[i].equals(first))) {
                    f = true;
                    s = true;
                }
            } else if (f) {
                if (spl[i].equals(second)) s = true;
                else if (!(spl[i].equals(first))) f = false;
            } else if (spl[i].equals(first)) f = true;
        } 

        String[] res = new String[j];
        for (int i = 0; i < j; i++) res[i] = arr[i];

        return res;
    }
}
