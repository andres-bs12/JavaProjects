package DataServicesClases.ex6;

import java.util.List;

public class Project {
    private String projectName;
    private List<Employee> team;

    public Project(String projectName, List<Employee> team) {
        this.projectName = projectName;
        this.team = team;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void setTeam(List<Employee> team) {
        this.team = team;
    }
}
