public class PremiumDiscountStrategy implements DiscountStrategy{
    
    public double ApplyDiscount(double  price){
        price=price-price*0.2;
        return price;
    }
}
