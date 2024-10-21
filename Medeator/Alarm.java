class Alarm extends Device {
    public Alarm(HomeMediator mediator) {
        super(mediator);
    }
    public void triggerEvent() {
        System.out.println("Alarm is ringing!");
        //call the notify() method of mediator for alarm event
    }
    //implement the reset alarm method (add a print statement)
}
