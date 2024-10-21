public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart(10000.0);
        System.out.println("Premium Customer price");
        cart.setStrategy(new PremiumDiscountStrategy());
        cart.calculateTotal();
        System.out.println("Regular Customer price");
        cart.setStrategy(new RegularDiscountStrategy());
        cart.calculateTotal();
        System.out.println("HolidaySpecial Customer price");
        cart.setStrategy(new HolidaySpecialDiscountStrategy());
        cart.calculateTotal();
    }

}
