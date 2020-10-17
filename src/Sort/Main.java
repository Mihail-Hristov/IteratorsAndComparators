package Sort;

import Sort.CompareByAge;
import Sort.CompareByName;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        Set<Person> personForNameSort = new TreeSet<>(new CompareByName());
        Set<Person> personForAgeSort = new TreeSet<>(new CompareByAge());

        for (int i = 0; i < numberOfLines; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            personForNameSort.add(person);
            personForAgeSort.add(person);
        }

        for (Person person : personForNameSort) {
            System.out.println(String.format("%s %d", person.getName(), person.getAge()));
        }

        for (Person person : personForAgeSort) {
            System.out.println(String.format("%s %d", person.getName(), person.getAge()));
        }
    }
}
