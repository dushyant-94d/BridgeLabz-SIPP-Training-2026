interface StreamingService {
    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming subscription active.");
    }
}

interface GamingService {
    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming subscription active.");
    }
}

class SmartTV implements StreamingService, GamingService {

    public void streamMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }

    public void playGame(String game) {
        System.out.println("Playing game: " + game);
    }

    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class MultiServi{
    public static void main(String[] args) {
        String[] movies = {"Avengers", "Inception", "Interstellar"};
        String[] games = {"FIFA", "Minecraft", "PUBG"};

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("Available Movies:");
        for (String movie : movies) {
            tv.streamMovie(movie);
        }

        System.out.println("Available Games:");
        for (String game : games) {
            tv.playGame(game);
        }
    }
}