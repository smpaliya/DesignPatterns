public class Soy extends CondimentDecorator{
    Beverage beverage;
    Soy(Beverage bev){
        this.beverage=bev;
    }
    String getDescription(){
        System.out.println("Soy added");
        return beverage.getDescription()+" with Soy";
    }
    double cost(){
        System.out.println("Condiment cost 50");
        return beverage.cost()+50;
    }
    }
