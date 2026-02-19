package DataServicesClases.ex07;

public class Book {
    private String name;
    private int borrows;
    private int state;
    private int delayedDays;

    public Book(String name, int borrows, int state, int delayedDays) {
        this.name = name;
        this.borrows = borrows;
        this.state = state;
        this.delayedDays = delayedDays;
    }

    public int getBorrows() {
        return borrows;
    }

    public void setBorrows(int borrows) {
        this.borrows = borrows;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDelayedDays() {
        return delayedDays;
    }

    public void setDelayedDays(int delayedDays) {
        this.delayedDays = delayedDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
