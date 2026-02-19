package DataServicesClases.ex05;

public class Student {
   private String name;
    private PerformanceRecord record;

    public Student(String name, PerformanceRecord record) {
        this.name = name;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PerformanceRecord getRecord() {
        return record;
    }

    public void setRecord(PerformanceRecord record) {
        this.record = record;
    }
}
