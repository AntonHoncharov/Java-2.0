package src.lessonTree;

public class Revers {

    public static void main(String[] args) {

        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        sentence = sentence.replace("Z", " ");
        String[] sentenceArray = new StringBuilder(sentence).reverse().toString().split(" ");
        StringBuilder sentenceRevers = new StringBuilder();
        for (int i = sentenceArray.length - 1; i >= 0; i--) sentenceRevers.append(sentenceArray[i]).append(" ");
        System.out.println(sentenceRevers);
    }
}
