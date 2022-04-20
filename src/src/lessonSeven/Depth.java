package src.lessonSeven;

public class Depth {

    public static void main(String[] args) {

        System.out.println(depth("(1+(2*3)+((8)/4))+1"));
        System.out.println(depth("(1)+((2))+(((3)))"));
    }

    public static int depth(String example) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < example.length(); i++) {
            if (example.charAt(i) == '(') min++;
            else if (example.charAt(i) == ')') min--;
            max = Math.max(max, min);
        }
        return max;
    }
}
