package DataServicesClases.ex6;

public class Task {
    private String description;
    private int hoursEstimated;
    private boolean isCompleted;

    public Task(boolean isCompleted, int hoursEstimated, String description) {
        this.isCompleted = isCompleted;
        this.hoursEstimated = hoursEstimated;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHoursEstimated() {
        return hoursEstimated;
    }

    public void setHoursEstimated(int hoursEstimated) {
        this.hoursEstimated = hoursEstimated;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
