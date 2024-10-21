public class TV implements Device{
    boolean switchon;
    int volume;
    int channel;
    public boolean isEnabled(){
            return switchon;
    };
    public void enable(){
        if(switchon==false){
            switchon=true;
        }
    };
    public void disable(){
        if(switchon==true){
            switchon=false;
        }
    };
    public int getVolume(){
        return volume;
    };
    public void setVolume(int percent){
        this.volume=percent;
    };
    public int getChannel(){
        return this.channel;
    };
    public void setChannel(int channel){
        this.channel=channel;
    };
    
}
