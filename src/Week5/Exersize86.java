package Week5;

public class Exersize86 {
    public static class LyyraCard {
        private double balance;

        public LyyraCard(double balance) {
            this.balance = balance;
        }

        public double balance() {
            return this.balance;
        }

        public void loadMoney(double amount) {
            this.balance += amount;
        }

        public boolean pay(double amount){
            if (balance() >= amount) {
                loadMoney(-amount);
                return true;
            } else {
                return false;
            }
        }
    }

    public static class CashRegister {
        private double cashInRegister;   // the amount of cash in the register
        private int economicalSold;      // the amount of economical lunches sold
        private int gourmetSold;         // the amount of gourmet lunches sold

        public CashRegister() {
            this.cashInRegister = 1000;
        }

        public double payEconomical(double cashGiven) {
            if (cashGiven >= 2.5) {
                this.cashInRegister += 2.5;
                this.economicalSold++;
                return cashGiven - 2.5;
            } else {
                return cashGiven;
            }
        }
        public boolean payEconomical(LyyraCard card) {
            if (card.balance() >= 2.5) {
                card.pay(2.5);
                this.economicalSold++;
                return true;
            } else {
                return false;
            }
        }

        public double payGourmet(double cashGiven) {
            if (cashGiven >= 4) {
                this.cashInRegister += 4;
                this.gourmetSold++;
                return cashGiven - 4;
            } else {
                return cashGiven;
            }
        }
        public boolean payGourmet(LyyraCard card) {
            if (card.balance() >= 4) {
                card.pay(4);
                this.gourmetSold++;
                return true;
            } else {
                return false;
            }
        }

        public void loadMoneyToCard(LyyraCard card, double sum) {
            if (sum > 0) {
                card.loadMoney(sum);
                this.cashInRegister += sum;
            }
        }

        public String toString() {
            return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
        }
    }

    public static void main(String[] args) {
        CashRegister unicafeExactum = new CashRegister();
        System.out.println( unicafeExactum );

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println( unicafeExactum );
    }
}
