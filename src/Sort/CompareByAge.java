package Sort;

import java.util.Comparator;

public class CompareByAge implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int result = first.getAge() - second.getAge();

        return result;
    }
}
