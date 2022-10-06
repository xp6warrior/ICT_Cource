package Week2;

import java.util.Scanner;

public class Exersize32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Till what? ");
        int n = s.nextInt();

        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        System.out.println(a);
    }
}
