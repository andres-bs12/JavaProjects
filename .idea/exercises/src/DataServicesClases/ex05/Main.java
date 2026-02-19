package DataServicesClases.ex05;

public class Main {
    public static void main(String[] args) {

        PerformanceRecord performanceStd1 = new PerformanceRecord(5.0, 110);
        Student std1 = new Student("Andres", performanceStd1);

        PerformanceRecord performanceStd2 = new PerformanceRecord(4.8, 115);
        Student std2 = new Student("Pablo",performanceStd2 );

        PerformanceRecord performanceStd3 = new PerformanceRecord(4.4, 130);
        Student std3 = new Student("John", performanceStd3);

        ScholarshipService service = new ScholarshipService();

        System.out.println(service.isEligibleForGrant(std1));
        System.out.println(service.isEligibleForGrant(std2));
        System.out.println(service.isEligibleForGrant(std3));
    }

}
