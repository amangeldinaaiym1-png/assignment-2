public class student extends person {

    private double gpa;

    public student() {
        super();
    }

    public student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0;
    }

    public String toString() {
        return "student: " + super.toString();
    }
}