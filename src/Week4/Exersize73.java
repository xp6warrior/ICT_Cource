package Week4;

public class Exersize73 {
    public static class Product {
        private final String nameAtStart;
        private final double priceAtStart;
        private final int amountAtStart;

        public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
            this.nameAtStart = nameAtStart;
            this.priceAtStart = priceAtStart;
            this.amountAtStart = amountAtStart;
        }

        public void printProduct() {
            System.out.println(nameAtStart + ", price " + priceAtStart + ", amount " + amountAtStart);
        }
    }

    public static void main(String[] args) {
        Product product = new Product("banana", 1.1d, 13);
        product.printProduct();
    }

}
