package Week6;

import java.util.Arrays;

public class Exersize98 {
    public static int[] copy(int[] array) {
        return array.clone();
    }

    public static int[] reverseCopy(int[] array) {
        int[] clone = new int[array.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = array[array.length - 1 - i];
        }
        return clone;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

}
