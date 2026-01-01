import java.util.ArrayList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {

        ArrayList<person> list = new ArrayList<person>();

        list.add(new employee("John", "Lennon", "Singer", 27045.78));
        list.add(new employee("George", "Harrison", "Guitarist", 50000));
        list.add(new student("Ringo", "Starr", 2.3));
        list.add(new student("Paul", "McCartney", 3.8));

        Collections.sort(list);
        printData(list);
    }

    public static void printData(Iterable<person> persons) {
        for (person p : persons) {
            System.out.println(
                    p.toString() + " earns " + p.getPaymentAmount() + " tenge"
            );
        }
    }
}
