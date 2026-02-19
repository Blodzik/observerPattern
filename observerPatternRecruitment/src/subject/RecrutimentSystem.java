package subject;

import core.RecruitmentObserver;
import core.RecruitmentSubject;

import java.util.ArrayList;
import java.util.List;

public class RecrutimentSystem implements RecruitmentSubject {
    private List<RecruitmentObserver> observers = new ArrayList<>();
    private String status;

    @Override
    public void registerObserver(RecruitmentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(RecruitmentObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (RecruitmentObserver observer : observers) {
            observer.onStatusChange(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("\n--- [SYSTEM HR] Status aplikacji zmieniony na: " + status + " ---");
        notifyObservers();
    }


}
