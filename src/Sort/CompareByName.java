package Sort;

import java.util.Comparator;

public class CompareByName implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        int result = first.getName().length() - second.getName().length();
        if (result == 0) {
            result = first.getName().toUpperCase().charAt(0) - second.getName().toUpperCase().charAt(0);
        }

        return result;
    }
}
