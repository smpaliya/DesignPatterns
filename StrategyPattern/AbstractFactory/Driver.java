package AbstractFactory;
public class Driver {
    public static void main(){
        Application ap;
        String osName=System.getProperty("os.name");
        if(osName.contains("win")){
            ap=new Application(new WinFactory());
        }
        else{
            ap=new Application(new MacFactory());
        }
    }
    
}
