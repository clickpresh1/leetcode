class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m = candies.length, mx = candies[0];
        List<Boolean> list = new ArrayList<>();

        for (int item : candies) if (item > mx) mx = item;

        for (int item : candies) {
            if (item + extraCandies >= mx) list.add(true);
            else list.add(false); 
        } 

        return list;
    }
}
