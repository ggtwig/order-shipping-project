public class Main {

    public static void main(String[] args) {

        Order book = new Order(true, 9.99, "Express", "ship50");
        Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
        Order mathsBook = new Order(true, 24.32, "Express");


        book.ship();
        chemistrySet.ship();

    }
}
