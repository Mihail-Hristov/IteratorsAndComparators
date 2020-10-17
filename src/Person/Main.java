package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> people = new ArrayList<>();

        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age,town);

            people.add(person);

            input = scanner.nextLine();
        }
        int numberOfPersonInCollection = Integer.parseInt(scanner.nextLine());

        Person personForCompare = people.get(numberOfPersonInCollection - 1);

        int countEquals = 0;

        for (Person person : people) {
            if (person.compareTo(personForCompare) == 0 ) {
                countEquals ++;
            }
        }
        int allPeople = people.size();
        int countNotEquals = allPeople - countEquals;

        String output;

        if (countEquals > 1){
            output = String.format("%d %d %d", countEquals, countNotEquals, allPeople);
        }else {
            output = "No matches";
        }

        System.out.println(output);

    }
}
