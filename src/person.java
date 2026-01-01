public class person implements payable, Comparable<person> {

    protected int id;
    protected String name;
    protected String surname;

    protected static int nextId = 1;

    public person() {
        id = nextId;
        nextId++;
    }

    public person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public double getPaymentAmount() {
        return 0;
    }

    public int compareTo(person p) {
        if (this.getPaymentAmount() > p.getPaymentAmount()) {
            return 1;
        } else if (this.getPaymentAmount() < p.getPaymentAmount()) {
            return -1;
        }
        return 0;
    }
}
