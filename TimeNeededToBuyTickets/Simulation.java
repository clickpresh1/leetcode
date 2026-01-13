class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int m = tickets.length, count = 0, min = tickets[0];

        for (int item : tickets) if (item < min) min = item;

        if (tickets[k] == min) return ((min - 1) * m) + (k + 1);

        while (true) {
            int localMin = 100;
            for (int i = 0; i < m; i++) {
                if (tickets[i] - min < 0) tickets[i] = 0;
                else {
                    tickets[i] -= min;
                    count += min;
                } 

                if ((k == i) && (tickets[k] == 0)) {
                    i++;
                    while (i < m) {
                        if (tickets[i] - min >= 0) {
                            count += min - 1;
                        } 

                        i++;
                    } 

                    return count;
                }

                if ((tickets[i] > 0) && (tickets[i] < localMin)) localMin = tickets[i];
            }  

            min = localMin;
        }
    } 
}
