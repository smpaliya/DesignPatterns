

public class StreamingFacade {
    UserAccount UserAcc;
    MovieSelection movieSelection;
    StreamingServices streamingservices;
    PaymentProcessor Payment;

    StreamingFacade(String userName,String subScription){
        this.UserAcc=new UserAccount(userName,subScription);
        this.movieSelection=new MovieSelection();
        this.streamingservices=new StreamingServices();
        this.Payment=new PaymentProcessor();
    }
    public void StreamMovie(String movie){
        boolean ans=UserAcc.checkSubscription(UserAcc.UserName);
        if(ans){
            movieSelection.selectMovie(movie);
            streamingservices.prepareStream(movie);
            streamingservices.startStream();
            Payment.processPayment(UserAcc.UserName,(double)10000);
        }
        else{
            System.out.println("No subscription found");
        }
       

    }
}
