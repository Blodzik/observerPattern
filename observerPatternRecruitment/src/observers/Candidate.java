package observers;

import core.RecruitmentObserver;

public class Candidate implements RecruitmentObserver {
    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    @Override
    public void onStatusChange(String status) {
        if (status.equals("INTERVIEW_INVITE")) {
            System.out.println(name + " (Kandydat): YES! Ironing my shirt!");
        } else if (status.equals("REJECTED")) {
            System.out.println(name + " (Kandydat): Oh well, keep trying.");
        }
    }
}
