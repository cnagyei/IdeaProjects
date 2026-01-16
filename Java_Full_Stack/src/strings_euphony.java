public class strings_euphony {
    public static void main(String[] args) {

    }

    public int getMinInsertions(String word) {
        int insertions = 0;
        int consecutiveCount = 0;
        Boolean wasLastVowel = null;

        for (int i = 0; i < word.length(); i++) {
            boolean isCurrentVowel = isVowel(word.charAt(i));

            if (wasLastVowel != null && isCurrentVowel == wasLastVowel) {
                consecutiveCount++;
            }
        }
        return insertions;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'y';
    }
}
