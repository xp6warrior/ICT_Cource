package Week3;

import Others.ScannerClass;

public class Exersize56 {
    public static String reverse(String text) {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.print("Type in your text: ");
        String text = ScannerClass.s.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

}
