package Week3;

import Others.ScannerClass;

public class Exersize48 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();
        System.out.println("First character: " + firstCharacter(name));
    }

    static char firstCharacter(String s) {
        return s.charAt(0);
    }
}
