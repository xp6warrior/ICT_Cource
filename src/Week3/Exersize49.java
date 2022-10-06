package Week3;

import Others.ScannerClass;

public class Exersize49 {
    public static void main(String[] args) {
        System.out.println("Type your name: ");
        String name = ScannerClass.s.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }

    static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }
}
