package src.lessonEight;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int a = 2;
        int b = 3;
        int c = 4;

        fibonacci.fibonacci(a);
        fibonacci.fibonacci(b);
        fibonacci.fibonacci(c);

    }

    private void fibonacci(int N) {
        if (N < 2) {
            return;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= N; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
