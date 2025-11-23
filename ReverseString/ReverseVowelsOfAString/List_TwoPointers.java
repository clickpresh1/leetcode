class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> vow = new ArrayList<>();

        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');

        int x = 0;
        int y = arr.length - 1;

        while (x < y) {
            if ((vow.contains(arr[x])) && (vow.contains(arr[y]))) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
                
                x += 1;
                y -= 1;
            } else if ((vow.contains(arr[x])) && (!(vow.contains(arr[y])))) {
                y -= 1;
            } else if ((!(vow.contains(arr[x]))) && ((vow.contains(arr[y])))) {
                x += 1;
            } else if ((!(vow.contains(arr[x]))) && (!(vow.contains(arr[y])))) {
                x += 1;
                y -= 1;
            }
        } 

        return new String(arr);
    }
}
