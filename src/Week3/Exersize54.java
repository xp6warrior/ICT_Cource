package Week3;

import Others.ScannerClass;

public class Exersize54 {
    public static void main(String[] args) {
        System.out.println("Type a word: ");
        String word = ScannerClass.s.nextLine();
        System.out.println("Length of last part: ");
        int length = ScannerClass.s.nextInt();

        System.out.println("Result: " + word.substring(length));
    }
}
