class Solution {
    public int[] findArray(int[] pref) {
        int i = 0, prevPref = 0;
        for (int item : pref) {
            pref[i++] = prevPref ^ item;
            prevPref = item; 
        } 

        return pref;
    }
}
