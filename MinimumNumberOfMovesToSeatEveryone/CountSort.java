class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int m = seats.length;
        int[] seatsFreq = new int[101], studentsFreq = new int[101];

        for (int i = 0; i < m; i++) {
            seatsFreq[seats[i]]++; 
            studentsFreq[students[i]]++;
        } 

        int j = 0, k = 0;
        for (int i = 1; i < 101; i++) {
            if (seatsFreq[i] > 0) {
                while (seatsFreq[i] > 0) {
                    seats[j++] = i;
                    seatsFreq[i]--;
                }
            } 

            if (studentsFreq[i] > 0) {
                while (studentsFreq[i] > 0) {
                    students[k++] = i;
                    studentsFreq[i]--;
                }
            }
        } 

        int count = 0;
        for (int i = 0; i < m; i++) {
            count += Math.abs(seats[i] - students[i]);
        } 

        return count;
    }
}
