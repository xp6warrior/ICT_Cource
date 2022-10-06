package Week3;

import Others.ScannerClass;

public class Exersize47 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(name));
    }

    static int calculateCharacters(String s) {
        return s.length();
    }
}
