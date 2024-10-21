public class ShoppingCart {
    double sumOfPrice;
    DiscountStrategy strategy;
    ShoppingCart(double sumOfPrice){
        this.sumOfPrice=sumOfPrice;
    }
    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }
    double calculateTotal(){
        double price=strategy.ApplyDiscount(sumOfPrice);
        System.out.println("Price:"+price);
           return price;
    }
}