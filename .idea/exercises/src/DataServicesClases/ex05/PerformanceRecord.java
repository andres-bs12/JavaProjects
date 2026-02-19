package DataServicesClases.ex05;

public class PerformanceRecord {
    double averageGrade;
    int creditsCompleted;

    public PerformanceRecord(double averageGrade, int creditsCompleted) {
        this.averageGrade = averageGrade;
        this.creditsCompleted = creditsCompleted;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }
}
