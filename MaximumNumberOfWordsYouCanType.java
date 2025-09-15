import java.util.ArrayList;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        int value = 0;
        ArrayList<String> list = new ArrayList<>();
        String[] textSplit = text.split(" ");
        for (int i = 0; i < textSplit.length; i++) {
            for (int j = 0; j < brokenLetters.length(); j++) {
                if ((textSplit[i].contains(String.valueOf(brokenLetters.charAt(j))))) {
                    break;
                } else {
                    count += 1;
                }
            } 
            if (count == brokenLetters.length()) {
                list.add(textSplit[i]);
                System.out.println(list.get((list.size() - 1)));
            } 

            // reset count
            count = 0;
        } 

        return list.size();
    } 
}
