package Week2;

import Others.ScannerClass;

public class Exersize34 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        int a = ScannerClass.s.nextInt();

        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        System.out.println("Factorial is: " + b);
    }
}
