package Week3;

import Others.ScannerClass;

import java.util.ArrayList;
import java.util.Collections;

public class Exersize59 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        String input = "_";
        while (!input.equals("")) {
            System.out.println("Type a word: ");
            input = ScannerClass.s.nextLine();
            list.add(input);
        }

        System.out.println("You typed the following words:");
        Collections.reverse(list);
        for (String word: list) {
            System.out.println(word);
        }
    }
}
