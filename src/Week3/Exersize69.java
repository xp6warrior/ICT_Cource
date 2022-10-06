package Week3;

import java.util.Scanner;

public class Exersize69 {
    public static boolean palindrome(String text) {
        String reverse = Exersize56.reverse(text);
        return text.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
