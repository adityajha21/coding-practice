package design.pattern.observer;


// Design an event where change in one object should notify all the dependent objects

public interface Observer {
    public void update(String news);
}
