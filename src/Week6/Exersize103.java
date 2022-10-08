package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exersize103 {
    public static class Bird {
        private final String name;
        private final String latinName;
        private int observations = 0;

        public Bird(String name, String latinName) {
            this.name = name;
            this.latinName = latinName;
        }

        public void observed() {
            observations++;
        }

        @Override
        public String toString() {
            return name + " (" + latinName + "): " + observations + " observations";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        System.out.println("?");
        String input = scanner.nextLine().toLowerCase().trim();

        while (!input.equals("quit")) {
            switch (input) {
                case "add":
                    add(scanner, birds);
                    break;
                case "observation":
                    observation(scanner, birds);
                    break;
                case "statistics":
                    for (Bird b: birds) {
                        System.out.println(b);
                    }
                    break;
                case "show":
                    show(scanner, birds);
                    break;
            }

            System.out.println("?");
            input = scanner.nextLine().toLowerCase().trim();
        }
    }

    private static void add(Scanner scanner, ArrayList<Bird> birds) {
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Latin name: ");
        String latinName = scanner.nextLine();

        birds.add(new Bird(name, latinName));
    }
    private static void observation(Scanner scanner, ArrayList<Bird> birds) {
        System.out.println("What was observed:? ");
        String name = scanner.nextLine().toLowerCase().trim();

        for (Bird b: birds) {
            if (b.name.toLowerCase().equals(name)) {
                b.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    private static void show(Scanner scanner, ArrayList<Bird> birds) {
        System.out.println("What? ");
        String name = scanner.nextLine().toLowerCase().trim();

        for (Bird b: birds) {
            if (b.name.toLowerCase().equals(name)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}
