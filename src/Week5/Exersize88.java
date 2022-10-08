package Week5;

import Others.ScannerClass;

import java.util.ArrayList;

public class Exersize88 {
    public static class Student {
        private final String name;
        private final String studentNumber;

        public Student(String name, String studentNumber) {
            this.name = name;
            this.studentNumber = studentNumber;
        }

        public String getName() {
            return name;
        }

        public String getStudentNumber() {
            return studentNumber;
        }

        @Override
        public String toString() {
            return getName() + " (" + getStudentNumber() + ")";
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        System.out.println("name: ");
        String name = ScannerClass.s.nextLine();
        while (!name.equals("")) {
            System.out.println("studentnumber: ");
            String number = ScannerClass.s.nextLine();

            list.add(new Student(name, number));

            System.out.println("name: ");
            name = ScannerClass.s.nextLine();
        }

        for (Student s: list) {
            System.out.println(s);
        }

        System.out.println("\nGive search term: ");
        String term = ScannerClass.s.nextLine();

        System.out.println("Results:");
        for (Student s: list) {
            if (s.name.contains(term)) {
                System.out.println(s);
            }
        }
    }
}
