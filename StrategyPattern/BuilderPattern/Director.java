package BuilderPattern;

public class Director {
    LaptopBuilder builder;
    Director(LaptopBuilder builder){
        //when we callDirector class we should call it with specific builder
        this.builder=builder;
    }
    void ConstructLaptop(String  ram,String processor,String Monitor,String TouchPad){
        builder.buildMonitor(Monitor);
        builder.buildProcessor(processor);
        builder.buildRam(ram);
        builder.buildTouchPad(TouchPad);
    }

    Laptop getLaptop(){
        return builder.getLaptop();
    }
    //builder class can be defined as static nested class
}
