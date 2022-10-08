package Week6;

import java.util.Arrays;

public class Exersize104 {
    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int i: array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int value) {
        int[] newArray = new int[array.length - value];
        for (int i = 0; i < array.length; i++) {
            if (i >= value) {
                newArray[i - value] = array[i];
            }
        }

        return indexOfTheSmallest(newArray) + value;
    }

    public static void swap(int[] array, int index1, int index2) {
        int num1 = array[index1];
        int num2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                array[i] = num2;
            } else if (array[i] == num2) {
                array[i] = num1;
            }
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
        }
    }


    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }
}
