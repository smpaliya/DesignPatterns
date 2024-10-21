public class MainDecorator {
    public static void main(String args[]){
        Beverage bev1=new Espresso();
        bev1.getDescription();
        bev1.cost();
        
        System.out.println("Order 2");
        Beverage bev2=new Espresso();
        Mocha EspressoWithMocha=new Mocha(bev2);
        EspressoWithMocha.getDescription();
        System.out.println("Total cost :"+EspressoWithMocha.cost());


        Mocha EspressoWithDoubleMocha=new Mocha(new Mocha(bev1));
        EspressoWithDoubleMocha.getDescription();
        System.out.println("Total cost :"+EspressoWithDoubleMocha.cost());
    }
    
}
