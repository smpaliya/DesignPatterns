public class RegularDiscountStrategy implements DiscountStrategy {
    
    public double ApplyDiscount(double  price){
        price=price-price*0.1;
        return price;
    }
}
