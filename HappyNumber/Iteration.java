class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;

        HashSet<Integer> set = new HashSet<>();
        
        set.add(n);

        while(true) {
            int x = n;
            int sum = 0;
            while (x != 0) {
                int rem = x % 10;
                sum += (rem * rem);
                x /= 10;
            } 

            n = sum;

            if (n == 1) return true;
            else {
                if (set.contains(n)) return false;
                else set.add(n);
            }
        } 
    }
}
