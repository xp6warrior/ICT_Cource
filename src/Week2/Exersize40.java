package Week2;

public class Exersize40 {
    public static void main(String[] args) {
        printXmasTree(15);
    }

    static void printWhitespaces(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print(" ");
        }
    }

    static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i + i - 1);
        }
    }

    static void printXmasTree(int size) {
        printTriangle(size);

        printWhitespaces(size - 2);
        printStars(3);
        printWhitespaces(size - 2);
        printStars(3);
    }

}
