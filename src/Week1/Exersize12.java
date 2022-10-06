package Week1;

import java.util.Scanner;

public class Exersize12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input a name: ");
        s.nextLine();
        System.out.print("Input the age: ");
        int a = Integer.parseInt(s.nextLine());
        System.out.print("\nInput another name: ");
        s.nextLine();
        System.out.print("Input their age: ");
        int b = Integer.parseInt(s.nextLine());
        System.out.print("\nThe sum of their ages is: " + (a+b));
    }
}
