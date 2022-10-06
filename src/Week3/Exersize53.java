package Week3;

import Others.ScannerClass;

public class Exersize53 {
    public static void main(String[] args) {
        System.out.println("Type a word: ");
        String word = ScannerClass.s.nextLine();
        System.out.println("Length of first part: ");
        int length = ScannerClass.s.nextInt();

        System.out.println("Result: " + word.substring(0, length));
    }
}
