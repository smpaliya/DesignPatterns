import java.util.ArrayList;

public class WeatherData implements Subject{
     private ArrayList<Observer> observers;
     private float temperature;
     private float humidity;
     private float pressure ;

        public WeatherData(){
            observers=new ArrayList<Observer>();
        }
     public void setHumidity(float humidity) {
         this.humidity = humidity;
         measurmentChanged(temperature, humidity,pressure);
     }
     public float getHumidity() {
         return humidity;
     }
     public void setPressure(float pressure) {
         this.pressure = pressure;
         measurmentChanged(temperature, humidity,pressure);
     }
     public void setParameters(float temp,float humidity,float pressure){
        this.humidity=humidity;
        this.pressure=pressure;
        this.temperature=temp;
        measurmentChanged(temperature, humidity,pressure);
     }
     public float getPressure() {
         return pressure;
     }
     public void setTemperature(float temperature) {
         this.temperature = temperature;
         measurmentChanged(temperature, humidity,pressure);
     }
     public float getTemperature() {
         return temperature;
     }
     public void registerObserver(Observer o){
        observers.add(o);
     }
    public void removeObserver(Observer o){
            if(observers.contains(o)){
                int i=observers.indexOf(o);
                observers.remove(i);
            }
    }
    public void measurmentChanged(float temp,float humidity,float pressure){
        System.out.println("Measurment changed");
        notifyObserver();
    }
    public void notifyObserver(){
        for(Observer o :observers ){
            o.update(temperature, humidity, pressure);
        }
    }
}