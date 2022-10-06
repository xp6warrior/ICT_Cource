package Week3;

import Others.ScannerClass;

public class Exersize52 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();

        System.out.println("In reverse: ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
