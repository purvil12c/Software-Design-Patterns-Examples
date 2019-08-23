package observer;

public class WeatherWebApp implements Subscriber {

  Publisher publisher;
  String weatherData;

  public WeatherWebApp(Publisher publisher){
    this.publisher = publisher;
    this.weatherData = publisher.getState();
  }

  @Override
  public void pullFromPublisher() {
    this.weatherData = publisher.getState();
  }

  @Override
  public void outputData() {
    System.out.println("Web:: " + this.weatherData);
  }
}
