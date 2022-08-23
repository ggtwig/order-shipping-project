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
        String couponCode = coupon;
        if (isFilled) {
            System.out.println("Order is in transit!");
        } else {
            System.out.println("Order not ready!");
        }


        double shippingCost = calculateShipping();

            if (coupon != null) {
                if (couponCode.equals("freeShipping")) {
                    shippingCost = 0;
                } else if (couponCode.equals("ship50")) {
                    shippingCost = 0.50;
                }
            }

        System.out.print("Shipping cost: £");
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
            case "Next Day":
                shippingCost = 2.50;
                break;
            default:
                shippingCost = 0.75;
        }
        return shippingCost;
    }
}