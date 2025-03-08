package design.pattern.observer;

public class NewsPaper implements Observer {

   String newsPaperTitle;

   public NewsPaper(String newsPaperTitle) {
        this.newsPaperTitle = newsPaperTitle;
    }

    @Override
    public void update(String news) {
        System.out.println("New paper updated: " + news);
    }
}
