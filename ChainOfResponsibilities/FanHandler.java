public class FanHandler extends EmailHandler{
    
    public void handleRequest(EmailRequest emailrequest){
        if (emailrequest.type.equals("Fan")) {
            System.out.println("Send to seo");
            
        }
        else if(Nexthandler!=null){
            Nexthandler.handleRequest(emailrequest);
        }
    }
}
