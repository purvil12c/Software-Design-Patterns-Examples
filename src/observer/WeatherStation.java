package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {

  String state = "Initial State";
  List<Subscriber> subscriberList = new ArrayList<>();

  @Override
  public void registerSubscriber(Subscriber subscriber) {
    this.subscriberList.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
    this.subscriberList.remove(subscriber);
  }

  @Override
  public void notifyAllSubscribers() {
    this.subscriberList.forEach(subscriber -> subscriber.pullFromPublisher());
  }

  @Override
  public String getState() {
    return this.state;
  }

  @Override
  public void setState(String state) {
    this.state = state;
    // notify all the subscribers once the update to the state has been made.
    this.notifyAllSubscribers();
  }
}
