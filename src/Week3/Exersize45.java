package Week3;

public class Exersize45 {
    public static int greatest(int number1, int number2, int number3) {
        return Math.max(Math.max(number1, number2), number3);
    }

    public static void main(String[] args) {
        int answer =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer);
    }

}
