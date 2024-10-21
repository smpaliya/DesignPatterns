package Example2;

public class ReportingManager1 extends LeaveHandler{
    
    public void handleRequest(LeaveRequest request){
        if(request.daysofleave<=5){
            System.out.println("Your request will be handled by Reporting Manager1");
        }
        else if(nextHandler!=null){
            nextHandler.handleRequest(request);
        }
    }
}
