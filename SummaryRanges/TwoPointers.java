class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        if (nums.length == 0) return list;

        int i = 0;
        int x = nums[0];
        i += 1;
        while (i < nums.length) {
            int y = nums[i - 1];
            if ((y + 1) == nums[i]) {
                y = nums[i];
                
                if (i == (nums.length - 1)) {
                    list.add(x + "->" + y);
                    return list;
                }
            } else {
                if (y != x) {
                    list.add(x + "->" + y);

                } else {
                    list.add(x + "");
                }

                x = nums[i];
            } 

            i += 1;
        } 

        list.add(x + "");

        return list;

    }
}
