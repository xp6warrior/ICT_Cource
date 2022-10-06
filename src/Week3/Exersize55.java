package Week3;

import Others.ScannerClass;

public class Exersize55 {
    public static void main(String[] args) {
        System.out.println("Type a word: ");
        String a = ScannerClass.s.nextLine();
        System.out.println("Type another word: ");
        String b = ScannerClass.s.nextLine();

        int wordIndex = a.indexOf(b);
        if (wordIndex != -1) {
            String word = a.substring(wordIndex);
            System.out.println("The word " + a + " is found in the word " + b);
        } else {
            System.out.println("The word " + a + " is not found in the word " + b);
        }
    }
}
