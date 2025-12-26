class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int m = distance.length, sum = 0, clock = 0, antiClock = 0;

        int i = start;
        while (i % m != destination) clock += distance[i++ % m];

        int j = destination;
        while (j % m != start) antiClock += distance[j++ % m];

        return (clock < antiClock) ? clock : antiClock;
    }
}
