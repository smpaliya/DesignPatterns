public class HolidaySpecialDiscountStrategy implements DiscountStrategy{
    
    public double ApplyDiscount(double  price){
        price=price-price*0.3;
        return price;
    }
}
