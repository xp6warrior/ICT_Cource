package Week2;

public class Exersize39 {
    public static void main(String[] args) {
        //printTriangle(4);
    }

    static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
