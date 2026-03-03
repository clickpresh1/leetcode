class Solution {
    public String frequencySort(String s) {
        int m = s.length(), mx = 1, mn = 500001;
        int[] map1 = new int[10], map2 = new int[26], map3 = new int[26];
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c < 'A') {
                map1[c - '0']++;

                int e = map1[c - '0'];

                if (e > mx) mx = e;
                if (e < mn) mn = e;
            } else if (c < 'a') {
                map2[c - 'A']++;

                int f = map2[c - 'A'];

                if (f > mx) mx = f;
                if (f < mn) mn = f;
            } else {
                map3[c - 'a']++;

                int g = map3[c - 'a'];

                if (g > mx) mx = g;
                if (g < mn) mn = g;
            }
        } 

        int range = mx - mn + 1;
        List<Character>[] bucks = new ArrayList[range];

        for (int i = 0; i < 10; i++) {
            int e = map1[i];

            if (e != 0) {
                e = e - mn;

                if (bucks[e] == null) bucks[e] = new ArrayList<>();

                char c = (char) (i + '0');

                bucks[e].add(c);
            }
        }

        for (int i = 0; i < 26; i++) {
            int f = map2[i], g = map3[i];

            if (f != 0) {
                f = f - mn;

                if (bucks[f] == null) bucks[f] = new ArrayList<>();

                char c = (char) ('A' + i);

                bucks[f].add(c);
            } 

            if (g != 0) {
                g = g - mn;

                if (bucks[g] == null) bucks[g] = new ArrayList<>(); 

                char d = (char) ('a' + i);

                bucks[g].add(d);
            }
        } 

        int k = 0;
        char[] res = new char[m];
        for (int i = range - 1; i >= 0; i--) {
            if (bucks[i] == null) continue;

            int u = bucks[i].size(), j = i;
            int v = 0;

            while (v < u) {
                char c = (bucks[i].get(v));

                while (j >= 0) {
                    res[k++] = c;
                    j--;
                } 

                j = i;
                v++;
            } 
        } 

        return new String(res);
    }
}
