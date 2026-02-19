import observers.AnalyticsBot;
import observers.BargainHunter;
import subject.Auction;


public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();

        BargainHunter me = new BargainHunter("Nazar", 2000, auction);
        AnalyticsBot bot = new AnalyticsBot(auction);

        auction.registerObserver(me);
        auction.registerObserver(bot);

        auction.setPrice(2100);
        auction.setPrice(1900);
        auction.setPrice(1800);
    }
}