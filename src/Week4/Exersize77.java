package Week4;

public class Exersize77 {
    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balanceAtStart) {
            this.balance = balanceAtStart;
        }

        public String toString() {
            return "This card has " + balance + " euros";
        }

        public void payEconomical() {
            if (balance - 2.5d > 0) {
                balance -= 2.5d;
            }
        }

        public void payGourmet() {
            if (balance - 4d > 0) {
                balance -= 4d;
            }
        }

        public void loadMoney(double amount) {
            if (amount > 0) {
                if (balance + amount <= 150d) {
                    balance += amount;
                } else {
                    balance = 150d;
                }
            }
        }

    }

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);
    }
}
