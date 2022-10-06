package Week2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exersize33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lower bound: ");
        int low = s.nextInt();
        System.out.println("Higher bound: ");
        int high = s.nextInt();

        int a = 0;
        for (int i = low; i <= high; i++) {
            a += i;
        }
        System.out.println(a);
    }
}
