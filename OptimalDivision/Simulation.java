class Solution {
    public String optimalDivision(int[] nums) {
        int m = nums.length;
        StringBuilder sb = new StringBuilder();

        sb.append(nums[0]);

        if (m == 1) return sb.toString();
        else if (m == 2) {
            sb.append('/').append(nums[1]);
            
            return sb.toString();
        } else {
            sb.append('/').append('(');
            for (int i = 1; i < m - 1; i++) {
                sb.append(nums[i]).append('/');
            }
        } 

        sb.append(nums[m - 1]).append(')');

        return sb.toString();
    }
}
