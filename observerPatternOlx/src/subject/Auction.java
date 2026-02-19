package subject;

import core.olxObserver;
import core.olxSubject;

import java.util.ArrayList;
import java.util.List;

public class Auction implements olxSubject {
    private static String name = "OLX";
    private List<olxObserver> observers = new ArrayList<>();
    private double price;

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(olxObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(olxObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        List<olxObserver> copyList = new ArrayList<>(observers);
        for(olxObserver o : copyList) {
            o.notify(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Price was changed to " + price);
        notifyObservers();
    }
}
