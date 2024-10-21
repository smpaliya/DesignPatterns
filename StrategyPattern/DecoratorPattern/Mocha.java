public class Mocha extends CondimentDecorator {
    Beverage beverage;
    Mocha(Beverage bev){
        this.beverage=bev;
    }
    String getDescription(){
        System.out.println("Mocha added");
        return beverage.getDescription()+" with Mocha";
    }

    double cost(){
        System.out.println("Condiment cost 40");
        return beverage.cost()+40;
    }
}
