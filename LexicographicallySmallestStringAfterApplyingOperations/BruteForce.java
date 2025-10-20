class Solution {
    public static String findLexSmallestString(String s, int a, int b) {
        int m = s.length();
        int total = 10 * 10 * m;
        int count = 0;
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> rot = new HashSet<>();
        HashSet<String> ad = new HashSet<>();

        count += 1;
        hashSet.add(s);
        String minVal = s;

        for (int i = 0; i < 10; i++) {
            s = addToOdd(s, a);
            if (ad.contains(s)) {
                continue;
            } 
            if (!(hashSet.contains(s))) {
                hashSet.add(s);
                ad.add(s);
                count += 1;
            } 
            
            minVal = minString(s, minVal);
            minVal = minString(rotate(s, b), minVal);
            for (int j = 0; j < m; j++) {
                if (count == total) {
                    break;
                } 
                s = rotate(s, b);
                if (rot.contains(s)) {
                    continue;
                }
                if (!(hashSet.contains(s))) {
                    hashSet.add(s);
                    rot.add(s);
                    count += 1;
                } 
                minVal = minString(s, minVal);
                minVal = minString(rotate(s, b), minVal);
                for (int k = 0; k < 10; k++) {
                    if (count == total) {
                        break;
                    }   
                    s = addToOdd(s, a);
                    if (!(hashSet.contains(s))) {
                        hashSet.add(s);
                        count += 1;
                    } 
                    minVal = minString(s, minVal);
                    minVal = minString(rotate(s, b), minVal);
                    
                } 
            } 
        }
        
        return minVal;
    } 

    public static String addToOdd(String s, int a) {
        int m = s.length();
        char[] arr = s.toCharArray();

        for (int i = 1; i < m; i += 2) {
            int helper = arr[i] - '0';
            helper = (helper + a) % 10;
            arr[i] = (char) (helper + '0');
        }

        return String.valueOf(arr);
    }

    public static String rotate(String s, int b) {
        int m = s.length();
        char[] arr = s.toCharArray();
        int j = 0;
        
        while (j < b) {
            char temp1 = arr[0];
            for (int i = 0; i < m; i++) {
                char temp2 = arr[(i + 1) % m];
                arr[(i + 1) % m] = temp1;
                temp1 = temp2;
            } 
            j += 1;
        }

        return String.valueOf(arr);
    }


    public static String minString(String u, String v) {
        if (u.equals(v)) {
            return u;
        }
        String p = remvLeadZeros(u);
        String q = remvLeadZeros(v);
        int m = p.length(), n = q.length();
        if (m < n) return u;
        else if (n < m) return v;
        else {
            for (int i = 0; i < m; i++) {
                if ((p.charAt(i) - '0') < (q.charAt(i) - '0')) {
                    return u;
                } else if ((p.charAt(i) - '0') > (q.charAt(i) - '0')) {
                    return v;
                } 
            } 

            return u;
        } 
    } 

    public static String remvLeadZeros(String s) {
        int m = s.length();
        for (int i = 0; i < m; i++) {
            if (s.charAt(i) != '0') {
                return s.substring(i);
            }
        } 

        return "0";
    }
} 
