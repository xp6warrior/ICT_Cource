package Week1;

import java.util.Scanner;

public class Exersize10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input the radius: ");
        float r = Integer.parseInt(s.nextLine());
        System.out.print("\nCircumference of the circle: "+(2 * Math.PI * r));
    }
}
