abstract class Beverage{
    String description;
    String getDescription(){
        System.out.println(" description: "+description);
        return description;
    };
    abstract double cost();
}