import observers.Candidate;
import observers.HiringManager;
import subject.RecrutimentSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RecrutimentSystem recrutimentSystem = new RecrutimentSystem();

        Candidate me = new Candidate("Junior Java Dev");
        HiringManager boss = new HiringManager("Krakow R&D");

        recrutimentSystem.registerObserver(me);
        recrutimentSystem.registerObserver(boss);

        recrutimentSystem.setStatus("REJECTED");
        recrutimentSystem.setStatus("INTERVIEW_INVITE");
    }
}