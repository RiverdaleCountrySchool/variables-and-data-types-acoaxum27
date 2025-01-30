public class DoubleDiscount {
    public static void main(String[] args) {
        double price = 25.99;
        double discount = 0.15;
        double dPrice = price*discount;
        double fPrice = price-dPrice;

        System.out.println ("The sale price is $" + fPrice);

    }
}