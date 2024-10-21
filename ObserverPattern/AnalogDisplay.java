public class AnalogDisplay implements Observer,DisplayContent{
    
    private float temperature;
    private float humidity;
    private float pressure;
    Subject WeatherData;
    public void update(float temperature, float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
    }
    public void display(){
        System.out.println("Todays temperature: "+temperature);
        System.out.println("Todays humidity: "+humidity);
        System.out.println(" pressure: "+pressure);
    }
    
}


