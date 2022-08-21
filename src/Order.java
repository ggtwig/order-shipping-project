public class Order {

    protected boolean isFilled;
    protected double billAmount;
    protected String shipping;
    protected String coupon;

    Order(boolean filled, double cost, String shippingMethod){
        this.isFilled = filled;
        this.billAmount = cost;
        this.shipping = shippingMethod;
    }

    Order(boolean filled, double cost, String shippingMethod, String coupon) {
        this.isFilled = filled;
        this.billAmount = cost;
        this.shipping = shippingMethod;
        this.coupon = coupon;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
        } else {
            System.out.println("Order not ready");
        }

        double shippingCost = calculateShipping();

        System.out.println("Shipping cost: ");
        System.out.println(shippingCost);
    }

    public double calculateShipping() {
        double shippingCost;
        switch (shipping) {
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }
        return shippingCost;
    }
}