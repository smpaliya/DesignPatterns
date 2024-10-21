package BuilderPattern;

public interface LaptopBuilder {
    void buildRam(String ram);
    void buildProcessor(String Processor);
    void buildTouchPad(String TouchPad);
    void buildMonitor(String Monitor);

   Laptop getLaptop();
}
