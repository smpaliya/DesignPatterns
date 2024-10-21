class CoffeePot extends Device {
    
    //write the constructor and triggerEvent() methods
    // implement the startBrewing() method
    public CoffeePot(HomeMediator mediator) {
       super(mediator);
    }

    public void triggerEvent(){
        System.out.println("Coffee maker started");
    };
    public void startBrewing(){
        System.out.println("Brewing started");
    }
}
