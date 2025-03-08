package design.pattern.observer;

public class ObserverMain {
    public static void main(String[] args) {

        Observer newsPaper = new NewsPaper("hindustan");
        Observer tvChannel = new TvChannel("CNN");

        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.addObserver(newsPaper);
        newsPublisher.addObserver(newsPaper);
        newsPublisher.addObserver(newsPaper);
        newsPublisher.removeObserver(newsPaper);

        newsPublisher.addObserver(tvChannel);
        newsPublisher.addObserver(tvChannel);
        newsPublisher.removeObserver(tvChannel);

        newsPublisher.notifyObservers();








    }
}
