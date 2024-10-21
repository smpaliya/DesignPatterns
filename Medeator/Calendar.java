class Calendar extends Device {
    //write the constructor and triggerEvent() methods
    // implement the checkSchedule() method
    public Calendar(HomeMediator mediator) {
       super(mediator);
    }
    public void triggerEvent(){
        System.out.println("Event set on Calendar ");
    };
}