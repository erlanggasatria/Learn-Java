// LongestWord.java

public class Main {
    public static String getLongestWord(String[] words) {
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String[] words = {"Regiee", "Anak", "BaikR"};
        String longestWord = getLongestWord(words);

        System.out.println("The longest word is: " + longestWord);
    }
}
