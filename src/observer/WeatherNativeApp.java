package observer;

public class WeatherNativeApp implements Subscriber {

  Publisher publisher;
  String weatherData;

  public WeatherNativeApp(Publisher publisher){
    this.publisher = publisher;
    this.weatherData = publisher.getState();
  }

  @Override
  public void pullFromPublisher() {
    this.weatherData = publisher.getState();
  }

  @Override
  public void outputData() {
    System.out.println("Native:: " + this.weatherData);
  }
}
