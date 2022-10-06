package Week1;

import java.util.Scanner;

public class Exersize20 {
    public static void main(String[] args) {
        String user1 = "alex";
        String pass1 = "mightyducks";
        String user2 = "emily";
        String pass2 = "cat";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username: ");
        String u = s.nextLine();
        System.out.println("Enter password: ");
        String p = s.nextLine();
        if ((u.equals(user1) && p.equals(pass1)) || (u.equals(user2) && p.equals(pass2))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password is invalid!");
        }
    }
}
