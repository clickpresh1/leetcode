class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String[] arr = new String[n + 1];

        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                arr[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i] = "Buzz";
            } else {
                arr[i] = String.valueOf(i);
            } 

            list.add(arr[i]);
        } 

        return list;
    }
}
