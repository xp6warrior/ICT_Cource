package Week3;

public class Exersize46 {
    public static double average(int number1, int number2, int number3, int number4) {
        return Exersize43.sum(number1, number2, number3, number4) / 4d;
    }

    public static void main(String[] args) {
        double answer = average(4, 3, 6, 1);
        System.out.println("average: " + answer);
    }

}
