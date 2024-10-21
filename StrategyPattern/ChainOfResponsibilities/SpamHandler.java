public class SpamHandler extends EmailHandler{

    SpamHandler(){
    }
    public void handleRequest(EmailRequest emailrequest){
        if (emailrequest.type.equals("Spam")) {
            System.out.println("Delete email");
            
        }
        else if(Nexthandler!=null){
           
            Nexthandler.handleRequest(emailrequest);
        }
    }
}
