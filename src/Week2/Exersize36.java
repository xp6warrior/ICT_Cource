package Week2;

import Others.ScannerClass;

public class Exersize36 {
    public static void main(String[] args) {
        System.out.println("Type integers");

        int input = ScannerClass.s.nextInt();
        double result = 0;
        int amount = 0;
        int even = 0;
        int odd = 0;

        while (input != -1) {
            result += input;
            input = ScannerClass.s.nextInt();
            amount++;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The sum is: " + result);
        System.out.println("Amount of integers: " + amount);
        System.out.println("Average: " + (result / amount));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
