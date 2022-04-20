package src.lessonFour;

public class Words {

    public static void main(String[] args) {

        String[] setOfWordsOne = {"I ", "am ", "fo", "r ", "wor", "ld p", "ea", "ce"};
        String[] setOfWordsTwo = {"I a", "m f", "o", "r w", "orl", "d pe", "ace"};
        String[] setOfWordsThree = {"I", " am ", "fo", "r w", "orl", "ds pea", "ce"};
        String wordsOne = String.join("", setOfWordsOne);
        String wordsTwo = String.join("", setOfWordsTwo);
        String wordsThree = String.join("", setOfWordsThree);
        System.out.println(wordsOne.equals(wordsTwo));
        System.out.println(wordsOne.equals(wordsThree));
    }
}
