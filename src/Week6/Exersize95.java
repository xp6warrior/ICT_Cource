package Week6;

public class Exersize95 {
    public static class Money {

        private final int euros;
        private final int cents;

        public Money(int euros, int cents) {

            if (cents > 99) {
                euros += cents / 100;
                cents %= 100;
            }

            this.euros = euros;
            this.cents = cents;
        }

        public int euros(){
            return euros;
        }

        public int cents(){
            return cents;
        }

        public String toString() {
            String zero = "";
            if (cents <= 10) {
                zero = "0";
            }

            return euros + "." + zero + cents + "e";
        }


        public Money plus(Money added) {
            int euros = this.euros + added.euros;
            int cents = this.cents + added.cents;
            return new Money(euros, cents);
        }

        public Money minus(Money subtracted) {
            int euros = this.euros;
            int cents = this.cents;

            // not possible
            if ((this.euros == subtracted.euros && this.cents < subtracted.cents) || this.euros < subtracted.euros) {
                return new Money(0, 0);
            }

            // transferring tens
            if (this.cents < subtracted.cents) {
                euros--;
                cents += 100;
            }

            euros -= subtracted.euros;
            cents -= subtracted.cents;

            return new Money(euros, cents);
        }

        public boolean less(Money compared) {
            if (this.euros < compared.euros) {
                return true;
            }

            if (this.euros == compared.euros && this.cents < compared.cents) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Money a = new Money(10,0);
        Money b = new Money(3,50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);         // NOTE: new Money-object is created and reference to that is assigned to variable c
        //       the Money object 6.50e that variable c used to hold, is not referenced anymore

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
