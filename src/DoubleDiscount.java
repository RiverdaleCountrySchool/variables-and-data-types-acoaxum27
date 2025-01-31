public class DoubleDiscount {
    public static void main(String[] args) {
        double price = Double.valueOf (args [0]);
        double discount = Double.valueOf (args[1]);
        double dPrice = price*discount;
        double fPrice = price-dPrice;

        System.out.println ("The sale price is $" + fPrice);

    }
}
