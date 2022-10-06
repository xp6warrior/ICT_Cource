package Week2;

import java.util.Scanner;

public class Exersize30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Up to what number? ");
        int l = s.nextInt();

        int a = 0;
        while (a <= l) {
            System.out.println(a);
            a++;
        }
    }
}
