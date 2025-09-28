class Solution {
    public int[] searchRange(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        int a = -1;
        int b = -1;
        int[] arr = {a, b};
        int[] arrNotFound = {-1, -1};

        if ((nums.length == 1) && (nums[0] == target)) {
            arr[0] = 0;
            arr[1] = 0;
            return arr;
        }

        while (L <= R) {
            int mid = L + ((R - L) / 2);

            if ((nums[mid] == target)) {
                int i = 0;
                if (mid == 0) {
                    a = 0;
                } else if (mid > 0) {
                    i = mid - 1;
                    while (i >= 0) {
                        if (nums[i] < target) {
                            a = i + 1;
                            break;
                        } else if (i == 0) {
                            a = i;
                        }

                        i--;
                    } 
                }
                
                arr[0] = a;

                int j = nums.length - 1;
                if (mid == nums.length - 1) {
                    b = nums.length - 1;
                } else if (mid < nums.length - 1) {
                    j = mid + 1;
                    while (j < nums.length) {
                        if ((nums[j] > target)) {
                            b = j - 1;
                            break;
                        } else if (j == nums.length - 1) {
                            b = j;
                            
                        }

                        j++;
                    } 
                }
                
                arr[1] = b;

                return arr;
                
            } else if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        } 
        

        return arrNotFound;
        
    }
}
