package observer;

import core.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String product) {
        System.out.println("Yay! " + name + " is running to buy " + product + "!");
    }

}
