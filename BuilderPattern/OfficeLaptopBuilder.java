package BuilderPattern;

public class OfficeLaptopBuilder implements LaptopBuilder  {
    Laptop OfficeLaptop;
    OfficeLaptopBuilder(){
        OfficeLaptop=new Laptop();
    }


    public void buildRam(String ram){
        OfficeLaptop.setRam(ram);
    }

    public void buildMonitor(String Monitor){
        OfficeLaptop.setMonitor(Monitor);
    }
    public void buildTouchPad(String TouchPad){
        OfficeLaptop.setTouchPad(TouchPad);
    }
    public void buildProcessor(String Processor){
        OfficeLaptop.setProcessor(Processor);
    }
    
    
    public Laptop getLaptop(){
        return OfficeLaptop;
    }
}
