package Example2;

public class ReportingManager2 extends LeaveHandler {
    
    public void handleRequest(LeaveRequest request){
        if(request.daysofleave>5 && request.daysofleave<=15){
            System.out.println("Your request will be handled by Reporting Manager2");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
