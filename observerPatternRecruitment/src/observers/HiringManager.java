package observers;

import core.RecruitmentObserver;

public class HiringManager implements RecruitmentObserver {
    private String department;

    public HiringManager(String department) {
        this.department = department;
    }

    @Override
    public void onStatusChange(String status) {
        if(status.equals("INTERVIEW_INVITE")) {
            System.out.println("Manager działu " + department + ": I need to prepare Java questions.");
        }
    }
}
