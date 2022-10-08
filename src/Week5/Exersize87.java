package Week5;

public class Exersize87 {
    public static class Apartment {
        private int rooms;
        private int squareMeters;
        private int pricePerSquareMeter;

        public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
            this.rooms = rooms;
            this.squareMeters = squareMeters;
            this.pricePerSquareMeter = pricePerSquareMeter;
        }

        public boolean larger(Apartment other) {
            return this.squareMeters > other.squareMeters;
        }

        public int priceDifference(Apartment other) {
           int firstPrice = this.squareMeters * this.pricePerSquareMeter;
           int otherPrice = other.squareMeters * other.pricePerSquareMeter;
           return Math.abs(firstPrice - otherPrice);
        }

        public boolean moreExpensiveThan(Apartment other) {
            return this.squareMeters * this.pricePerSquareMeter > other.squareMeters * other.pricePerSquareMeter;
        }
    }
}
