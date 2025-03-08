package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

// All the logic are written here

public class NewsPublisher {
   private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("News updated");
        }
    }
}
