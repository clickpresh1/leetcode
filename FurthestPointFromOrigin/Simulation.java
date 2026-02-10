class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int m = moves.length(), x = 0, y = 0; 
        int lCount = 0, rCount = 0, dashCount = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'R') rCount++;
            else if (c == 'L') lCount++;
            else dashCount++;
        } 

        return Math.abs(lCount - rCount) + dashCount;
    }
}
