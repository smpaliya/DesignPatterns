public abstract class EmailHandler {
       EmailHandler Nexthandler;

       public void setHandler(EmailHandler handler) {
           this.Nexthandler = handler;
       }
    abstract void handleRequest(EmailRequest emailrequest);
}