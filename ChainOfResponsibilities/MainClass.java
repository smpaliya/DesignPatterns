public class MainClass {
    public static void main(String[] args) {

        EmailRequest email=new EmailRequest("Request", "Requesting to change the location of gdbafkbwf");

        RequestHandler requestHandler=new RequestHandler();
        SpamHandler spamhanlder=new SpamHandler();
        ComplaintHandler complaintHandler=new ComplaintHandler();
        FanHandler fanhandler=new FanHandler();
        spamhanlder.setHandler(requestHandler);
        requestHandler.setHandler(complaintHandler);
        complaintHandler.setHandler(fanhandler);

        spamhanlder.handleRequest(email);
    }
    
}
