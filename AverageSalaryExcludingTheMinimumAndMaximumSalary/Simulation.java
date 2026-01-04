class Solution {
    public double average(int[] salary) {
        int m = salary.length, sum = 0, max = 1000, min = 1000000;

        for (int i = 0; i < m; i++) {
            if (salary[i] > max) max = salary[i];
            if (salary[i] < min) min = salary[i];
            sum += salary[i];
        } 

        sum -= (max + min);

        return (1.0 * sum) / (m - 2);
    }
}
