public class WhippedCream extends CondimentDecorator{
    Beverage beverage;
    WhippedCream(Beverage bev){
        this.beverage=bev;
    }
    String getDescription(){
        System.out.println("WhippedCream added");
        return beverage.getDescription()+" with WhippedCream";
    }

    double cost(){
        System.out.println("Condiment cost 60");
        return beverage.cost()+60;
    }
}
