public class Display1 implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    public Display1(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    // In questo caso uso il metodo PUSH: l'observer riceve tutti i dati già separati. Problema: Il display usa solo 2 dati,
    // ma update ne riceve 3.
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    // In questo caso uso il metodo PULL: ricevo un oggetto, poi estraggo i dati che interessano a me. Problema: L'observer deve
    // conoscere il dato che deve manipolare, deve conoscere i suoi metodi.
    public void update(Object o) {
        WeatherData weatherData = (WeatherData) o;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
