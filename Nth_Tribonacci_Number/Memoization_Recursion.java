class Solution {
    public int tribonacci(int n) {

        return tribonacci(n, new HashMap<>());
    } 

    public static int tribonacci(int n, HashMap<Integer, Integer> hashMap) {
        if (n == 0) return 0;
        if ((n == 1) || (n == 2)) return 1;

        if (hashMap.containsKey(n)) return hashMap.get(n);

        int result = tribonacci(n - 1, hashMap) + tribonacci(n - 2, hashMap) + tribonacci(n -3, hashMap);
        hashMap.put(n, result);
        
        return result;
    }
}
