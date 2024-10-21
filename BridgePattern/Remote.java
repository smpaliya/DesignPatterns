public class Remote{
Device device=new TV();
public void togglePower(){
    if(device.isEnabled()){
        device.disable();
    }
    else{
        device.enable();
    }
}
public void volumeUp(){
    device.setVolume(device.getVolume()+1);
}
public void volumeDown(){
    device.setVolume(device.getVolume()-1);

}
public void channelDown(){
    device.setChannel(device.getChannel()-1);
}
public void channelUp(){
    device.setChannel(device.getChannel()+1);
}
}