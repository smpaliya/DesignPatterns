package Example2;

public class MainClass2 {
    public static void main(String[] args) {
        LeaveRequest myRequest=new LeaveRequest(10);
        LeaveRequest request2=new LeaveRequest(20);


        ReportingManager1 rm1=new ReportingManager1();
        ReportingManager2 rm2=new ReportingManager2();
        Director dr=new Director();

        rm1.setNextHandler(rm2);
        rm2.setNextHandler(dr);

        rm1.handleRequest(myRequest);

        System.out.println("Test case 2");
        rm1.handleRequest(request2);
    }
}
