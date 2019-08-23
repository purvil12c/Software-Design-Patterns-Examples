package observer;

/* Represents a publisher (observable) */
public interface Publisher {

  void registerSubscriber(Subscriber subscriber);

  void removeSubscriber(Subscriber subscriber);

  void notifyAllSubscribers();

  String getState();

  void setState(String state);
}
