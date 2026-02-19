package core;

public interface RecruitmentSubject {
    void registerObserver(RecruitmentObserver observer);
    void removeObserver(RecruitmentObserver observer);
    void notifyObservers();

}
