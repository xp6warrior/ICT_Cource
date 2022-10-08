package Week4;

import java.util.Arrays;
import java.util.Random;

public class Exersize81 {
    public static class PasswordRandomizer {
        private final int length;
        private final String symbols = "abcdefghijklmnopqrstuvwxyz";
        private final Random random = new Random();

        public PasswordRandomizer(int length) {
            this.length = length;
        }

        public String createPassword() {
            String pass = "";
            for (int i = 0; i < length; i++) {
                int symbolIndex = random.nextInt(symbols.length() - 1);
                pass += symbols.charAt(symbolIndex);
            }
            return pass;
        }
    }

    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
