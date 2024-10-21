package BuilderPattern;

public class GamingLaptopBuilder implements LaptopBuilder {

    Laptop GamingLaptop;
    GamingLaptopBuilder(){
        GamingLaptop=new Laptop();
    }
    public void buildRam(String ram){
        GamingLaptop.setRam(ram);
    }

    public void buildMonitor(String Monitor){
        GamingLaptop.setMonitor(Monitor);
    }
    public void buildTouchPad(String TouchPad){
        GamingLaptop.setTouchPad(TouchPad);
    }
    public void buildProcessor(String Processor){
        GamingLaptop.setProcessor(Processor);
    }

    public Laptop getLaptop(){
        return GamingLaptop;
    }
}
