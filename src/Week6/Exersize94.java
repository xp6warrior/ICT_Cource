package Week6;

import java.util.ArrayList;

public class Exersize94 {
    public static class Person {
        private final String name;
        private String number;

        public Person(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

        public void changeNumber(String number) {
            this.number = number;
        }

        @Override
        public String toString() {
            return name + "  " + "number: " + number;
        }
    }

    public static class Phonebook {
        ArrayList<Person> people = new ArrayList<>();

        public void add(String name, String number) {
            people.add(new Person(name, number));
        }

        public void printAll() {
            for (Person p: people) {
                System.out.println(p);
            }
        }

        public String searchNumber(String name) {
            for (Person p: people) {
                if (p.name.contains(name)) {
                    return p.number;
                }
            }
            return "number not known";
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Pekka Mikkola", "040-123123");
        phonebook.add("Edsger Dijkstra", "045-456123");
        phonebook.add("Donald Knuth", "050-222333");

        String number = phonebook.searchNumber("Pekka Mikkola");
        System.out.println( number );

        number = phonebook.searchNumber("Martti Tienari");
        System.out.println( number );
    }

}
