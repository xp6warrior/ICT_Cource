package Week2;

import Others.ScannerClass;

public class Exersize35 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        int n = ScannerClass.s.nextInt();

        int a = 0;
        for (int i = 0; i <= n; i++) {
            a += Math.pow(2, i);
        }
        System.out.println("Result is " + a);
    }
}
