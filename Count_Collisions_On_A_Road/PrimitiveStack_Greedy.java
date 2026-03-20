class Solution {
    public int countCollisions(String directions) {
        int m = directions.length(), cnt = 0;
        char[] arr = directions.toCharArray();
        int[] stack = new int[m];
        int top = -1;

        int u = 0;
        while (u < m) {
            char curr = arr[u];

            if (top != -1) {
                if (curr == 'L') {
                    if (stack[top] == 'R') {
                        cnt += 2; --top;

                        while ((top != -1) && (stack[top] == 'R')) {
                            cnt++; --top;
                        } 
                        
                        stack[++top] = 'S';
                    } else if (stack[top] == 'S') cnt++; 
                    else stack[++top] = 'L';
                } else if (curr == 'S') {
                    if (stack[top] == 'R') {
                        while ((top != -1) && (stack[top] == 'R')) {
                            cnt++; --top;
                        } 

                        stack[++top] = 'S';
                    } else if (stack[top] == 'L') stack[++top] = 'S';
                } else stack[++top] = 'R';
            } else stack[++top] = curr;

            u++;
        } 

        return cnt;
    }
}
