package Week3;

import Others.ScannerClass;

import java.util.ArrayList;

public class Exersize58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        String input = "_";
        while (true) {
            System.out.println("Type a word: ");
            input = ScannerClass.s.nextLine();
            if (words.contains(input)) {
                break;
            }
            words.add(input);
        }

        System.out.println("You typed the word " + input + " twice");
    }
}
