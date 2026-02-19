package DataServicesClases.ex6;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    public int calculateEmployeeLoad(Employee e) {
        int totalHours = 0;

        if (e != null && e.getTasks() != null) {
            for (Task task : e.getTasks()) {
                totalHours += task.getHoursEstimated();
            }
        }
        return totalHours;
    }

    public boolean isEmployeeOverloaded(Employee e) {
        int totalHours = calculateEmployeeLoad(e);
        return (totalHours > 40);
    }

    public List<String> getAtRiskEmployees(Project p) {
        List<String> overLoadEmployees = new ArrayList<>();
        for (Employee e : p.getTeam()) {
            if (isEmployeeOverloaded(e)) {
                overLoadEmployees.add(e.getName());
            }
        }
        return overLoadEmployees;
    }
}
