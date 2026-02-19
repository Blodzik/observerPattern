import observer.Customer;
import subject.AppleStore;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppleStore iSpot = new AppleStore();

        Customer me = new Customer("Nazar");
        Customer mom = new Customer("Olha");

        iSpot.registerObserver(me);
        iSpot.registerObserver(mom);

        iSpot.newDelivery("Iphone 17");
        iSpot.newDelivery("Samsung Galaxy A57");
    }
}