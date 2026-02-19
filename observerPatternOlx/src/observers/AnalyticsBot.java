package observers;

import core.olxObserver;
import subject.Auction;

public class AnalyticsBot implements olxObserver {
    private Auction auction;

    public AnalyticsBot(Auction auction) {
        this.auction = auction;
    }

    @Override
    public void notify(double price) {
        System.out.println(auction.getName() + " Logging new price to database: " + price);
    }
}
