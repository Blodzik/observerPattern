package subject;

import core.Observer;
import core.Subject;

import java.util.ArrayList;

public class AppleStore implements Subject {
    private ArrayList<Observer> observers;
    private String currentProduct;

    public AppleStore() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Store: A new customer subscribed to notifications.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Store: A customer unsubscribed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentProduct);
        }
    }

    public void newDelivery(String product) {
        this.currentProduct = product;
        System.out.println("\n--- APPLE STORE: NEW SHIPMENT ARRIVED: " + product + " ---");
        notifyObservers();
    }
}
