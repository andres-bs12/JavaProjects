package DataServicesClases.ex05;

public class ScholarshipService {

    public boolean isEligibleForGrant(Student student) {
        if (student.getRecord().getCreditsCompleted() > 120) {
            return (student.getRecord().getAverageGrade() >= 4.5);
        }
        else return student.getRecord().getAverageGrade() == 5.0 && student.getRecord().getCreditsCompleted() >= 100;
    }
}


