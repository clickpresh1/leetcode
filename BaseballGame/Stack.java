class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> q = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int temp1 = q.pop(), temp2 = q.peek() + temp1;
                q.push(temp1);
                q.push(temp2);
            } else if (operations[i].equals("D")) q.push(q.peek() * 2);
            else if (operations[i].equals("C")) q.pop();
            else q.push(Integer.valueOf(operations[i]));
        } 

        int sum = 0;
        
        while (!q.isEmpty()) sum += q.pop();

        return sum;
    }
}
