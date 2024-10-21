public class ComplaintHandler extends EmailHandler{
    

    public void handleRequest(EmailRequest emailrequest){
        if (emailrequest.type.equals("Complaint")) {
            System.out.println("Forward to legal department");
            System.out.println("Your Complaint will be worked on");
            
        }
        else if(Nexthandler!=null){
            Nexthandler.handleRequest(emailrequest);
        }
    }
}
