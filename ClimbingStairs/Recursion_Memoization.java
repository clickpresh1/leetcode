class Solution {
    public int climbStairs(int n) {
        
        return climbStairs(n, new HashMap<>());
    } 

    public int climbStairs(int n, HashMap<Integer, Integer> hashMap) {
        if (n == 1 || n == 2) return n;

        if (hashMap.containsKey(n)) return hashMap.get(n);

        int result = climbStairs(n - 1, hashMap) + climbStairs(n - 2, hashMap);
        hashMap.put(n, result);

        return result;
    } 
}
