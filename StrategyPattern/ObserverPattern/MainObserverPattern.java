public class MainObserverPattern {
    public static void main(String args[]){

        //subject
        WeatherData weatherData=new WeatherData();

        //observer
        CurrentConditionsDisplay currdisplay=new CurrentConditionsDisplay();

        weatherData.registerObserver(currdisplay);
        weatherData.setParameters(63, 29, 28);
        currdisplay.CurrentConditionDisplay(weatherData);
        currdisplay.display();
    }
}
