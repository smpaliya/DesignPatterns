class Sprinkler extends Device {
    //write the constructor and triggerEvent() methods
    // implement the checkWeather(), scheduleWatering() method
    public Sprinkler(HomeMediator mediator){
        super(mediator);
    }
    public void checkWeather() {
        System.out.println("Checking weather conditions...");
    }
    public void triggerEvent(){
        System.out.println("Sprinkler started...");
    }
}
