class Solution {
    public int fib(int n) {
        return fib(n, new HashMap<>());
    } 

    public static int fib(int n, HashMap<Integer, Integer> hashMap) {
        if (n <= 1) return n;

        if (hashMap.containsKey(n)) return hashMap.get(n);

        int result = fib(n - 1, hashMap) + fib(n - 2, hashMap);
        hashMap.put(n, result);
        
        return result;
    }
}
