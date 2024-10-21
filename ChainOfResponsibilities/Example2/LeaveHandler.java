package Example2;

public abstract class LeaveHandler {
    LeaveHandler nextHandler;

    abstract void handleRequest(LeaveRequest request);

    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
