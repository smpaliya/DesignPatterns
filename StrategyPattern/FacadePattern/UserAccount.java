public class UserAccount {
    String UserName;
    String Subscription=null;
    UserAccount(String name,String subscription){
        this.UserName=name;
        this.Subscription=subscription;
    
    }
    boolean checkSubscription(String user){
        if(this.Subscription!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
}