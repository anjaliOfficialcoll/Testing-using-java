package day02;

public class diamond {
    class Main {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i - 1; space++)
                System.out.print(" ");
            for (int star = 0; star < 2 * i + 1; star++)
                System.out.print("*");
            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            for (int space = 0; space < n - i - 1; space++)
                System.out.print(" ");
            for (int star = 0; star < 2 * i + 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}

    
}
