public class MainMediator {
    public static void main(String[] args) {
        //create a mediator
        HomeAutomationMediator mediator=new HomeAutomationMediator();

        // Simulate various events
        mediator.alarm.triggerEvent();
       
    }
}