package Week6;

public class Exersize96 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return sum;
    }
}
