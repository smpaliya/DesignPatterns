package BuilderPattern;

public class MainBuilderPattern {
    public static void main(String args[]){
        GamingLaptopBuilder gameLaptopBuilder=new GamingLaptopBuilder();
        Director D1=new Director(gameLaptopBuilder);
        D1.ConstructLaptop("Kingston Fury RGB", "AMD Ryzen 7", "Curved ultrawide QHD", "Touch pad");

        Laptop l1=D1.getLaptop();

        System.out.println("Gaming laptop with "+l1.ram+" ram ,"+l1.Processor+" processor "+l1.Monitor+" Monitor and a"+l1.touchPad);
    }
    
}
