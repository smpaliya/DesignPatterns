public class RequestHandler extends EmailHandler {
    public void handleRequest(EmailRequest emailrequest){
        if (emailrequest.type.equals("Request")) {
            System.out.println("Forward to dfjsinsoiv");
            
        }
        else if(Nexthandler!=null){
            Nexthandler.handleRequest(emailrequest);
        }
    }
}
