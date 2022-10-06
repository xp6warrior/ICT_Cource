package Week2;

import java.util.Scanner;

public class Exersize31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lower limit: ");
        int low = s.nextInt();
        System.out.println("Higher limit: ");
        int high = s.nextInt();

        int a = low;
        while (a <= high) {
            System.out.println(a);
            a++;
        }
    }
}
