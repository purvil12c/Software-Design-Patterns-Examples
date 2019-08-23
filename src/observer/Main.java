package observer;

public class Main {

  public static void main(String args[]) {

    // Setting up the publisher and its subscribers
    Publisher weatherStation = new WeatherStation();
    Subscriber webApp = new WeatherWebApp(weatherStation);
    Subscriber nativeApp = new WeatherNativeApp(weatherStation);

    // Register the subscribers to the publisher
    weatherStation.registerSubscriber(webApp);
    weatherStation.registerSubscriber(nativeApp);

    // Output initial weather data
    webApp.outputData();
    nativeApp.outputData();

    // Weather station updates its state with new forecast
    // (this update can certainly be coming from somewhere
    // else, but we explicitly give the weather station new data)
    weatherStation.setState("26 Degrees in Boston");

    // webApp and nativeApp automatically receive new weather data
    // (notice that we didn't pool for data)
    webApp.outputData();
    nativeApp.outputData();

    // Weather station updates its state with new forecast
    weatherStation.setState("-10 Degrees in Boston");

    // webApp and nativeApp automatically receive new weather data
    // (notice that we didn't pool for data)
    webApp.outputData();
    nativeApp.outputData();

  }
}
