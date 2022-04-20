package src.lessonFive;
import java.util.Arrays;
public class Example {

    public static int[] decompressRLElist(int[] number) {
        int sizeOne = 0;
        int sizeTwo = 0;
        for (int i = 0; i < number.length; i += 2)
            sizeOne += number[i];
        int[] result = new int[sizeOne];
        for (int i = 0; i < number.length; i += 2) {
            for (int j = 0; j < number[i]; j++)
                result[sizeTwo++] = number[i + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] exampleOne = {1, 2, 3, 4};
        int[] exampleTwo = {1, 1, 2, 3};
        int[] resultOne = decompressRLElist(exampleOne);
        int[] resultTwo = decompressRLElist(exampleTwo);
        System.out.println(Arrays.toString(resultOne));
        System.out.println(Arrays.toString(resultTwo));
    }
}
