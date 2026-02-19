package DataServicesClases.ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Service initialization
        ProjectService service = new ProjectService();

        // Task initialization
        Task task1 = new Task(false, 20, "Code review");
        Task task2 = new Task(false, 21, "Meeting");
        Task task3 = new Task(true, 10, "Read manual");
        // Grouping task
        List<Task> tasksAndres = new ArrayList<>(List.of(task1, task2));
        List<Task> tasksJuan= new ArrayList<>(List.of(task1, task3));

        // Employee initialization
        Employee emp1 = new Employee("Andres", tasksAndres);
        Employee emp2 = new Employee("Juan", tasksJuan);
        // Grouping employees
        List<Employee> employeesSecretProject = new ArrayList<>(List.of(emp1, emp2));

        // Project initialization
        Project newProject = new Project("Secret Project", employeesSecretProject);


        System.out.println(service.getAtRiskEmployees(newProject));

    }



}
