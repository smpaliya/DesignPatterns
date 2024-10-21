package Example2;

public class Director extends LeaveHandler{
    public void handleRequest(LeaveRequest request){
        if(request.daysofleave>15){
            System.out.println("Your request will be handled by Director");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
