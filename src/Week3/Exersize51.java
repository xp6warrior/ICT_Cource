package Week3;

import Others.ScannerClass;

public class Exersize51 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.println((i + 1) + ". character: " + name.charAt(i));
        }
    }
}
