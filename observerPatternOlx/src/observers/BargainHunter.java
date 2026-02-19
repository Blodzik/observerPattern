package observers;

import core.olxObserver;
import core.olxSubject;

public class BargainHunter implements olxObserver {
    private String name;
    private double budget;
    private olxSubject auction;

    public BargainHunter(String name, double budget, olxSubject auction) {
        this.name = name;
        this.budget = budget;
        this.auction = auction;
    }

    @Override
    public void notify(double price) {
        if(price <= budget) {
            System.out.println("User: " + name + " just bought an item for " + price);
            budget -= price;
            auction.removeObserver(this);
        } else {
            System.out.println("Too expensive still waiting");
        }
    }
}
