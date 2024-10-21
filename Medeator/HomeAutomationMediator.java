class HomeAutomationMediator implements HomeMediator {
    Alarm alarm;
    CoffeePot coffeePot;
    Calendar calendar;
    Sprinkler sprinkler;

    HomeAutomationMediator() {
        // initialize all the data members (appliances) with current  mediator
        coffeePot=new CoffeePot(this);
        calendar=new Calendar(this);
        sprinkler=new Sprinkler(this);
        alarm=new Alarm(this);
    }
    public void notify(String event, Device device) {
        switch (event) {
            case "alarmEvent":
                System.out.println("Alarm event detected!");
                //check schedule from calendar
                //start brewing the coffee
                //check the weather
                break;
            case "trashDay":
                //reset the alarm
                break;
            case "weekend":
                //schedule watering of sprinkler
                break;
            default:
                System.out.println("Unknown event.");
        }
    }
}
