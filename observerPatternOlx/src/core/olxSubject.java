package core;

public interface olxSubject {
    void registerObserver(olxObserver o);
    void removeObserver(olxObserver o);
    void notifyObservers();
}
