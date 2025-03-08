package design.pattern.observer;

public class TvChannel implements Observer {

    String channelName;

    public TvChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        System.out.println("Tv Channel updated: " + news);
    }
}
