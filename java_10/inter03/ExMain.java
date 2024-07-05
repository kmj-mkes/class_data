package java_10.inter03;

public class ExMain {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();
        buyer.order();
        seller.order();
    }

}
