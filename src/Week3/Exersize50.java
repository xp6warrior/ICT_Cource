package Week3;

import Others.ScannerClass;

public class Exersize50 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();

        if (name.length() >= 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
            }
        }
    }
}
