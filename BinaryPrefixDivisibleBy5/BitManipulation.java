class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int m = nums.length;
        List<Boolean> list = new ArrayList<>(m);

        int b = nums[0];
        list.add(b % 5 == 0);
        
        int i = 1;
        while (i < m) {
            b = (b << 1) | nums[i++];
            
            b %= 5; // this is because the modular operation won't change b's divisibility by 5, though b has changed

            list.add(b == 0);
        } 

        return list;
    }
}
