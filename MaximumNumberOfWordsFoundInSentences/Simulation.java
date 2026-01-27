class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;

        for (String s : sentences) {
            int locCount = 1;

            for (char c : s.toCharArray()) {
                if (c == ' ') locCount++;
            } 

            if (locCount > count) count = locCount;
        } 

        return count;
    }
}
