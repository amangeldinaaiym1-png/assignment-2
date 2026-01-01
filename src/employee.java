public class employee extends person {

    private String position;
    private double salary;

    public employee() {
        super();
    }

    public employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public double getPaymentAmount() {
        return salary;
    }

    public String toString() {
        return "employee: " + super.toString();
    }
}