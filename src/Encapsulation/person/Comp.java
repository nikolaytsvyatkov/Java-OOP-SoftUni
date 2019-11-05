package Encapsulation.person;

import java.util.Comparator;

public class Comp implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if (result == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return result;
    }
}
