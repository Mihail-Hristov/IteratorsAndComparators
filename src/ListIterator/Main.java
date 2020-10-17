package ListIterator;

import ListIterator.ListIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListIterator listIterator = new ListIterator();
        while (!"END".equals(input)) {
            String tokens[] = input.split("\\s+");

            String command = tokens[0];


            switch (command) {
                case "Create":
                    String[] newTokens = new String[tokens.length - 1];
                    int count = 0;
                    for (int i = 1; i < tokens.length; i++) {
                        newTokens[count] = tokens[i];
                        count ++;
                    }
                    listIterator = new ListIterator(newTokens);

                    break;
                case "Move":
                    boolean wasMoved = listIterator.move();
                    System.out.println(wasMoved);

                    break;
                case "Print":
                    System.out.println(listIterator.print());

                    break;
                case "HasNext":
                    boolean hasNext = listIterator.hasNext();
                    System.out.println(hasNext);

                    break;
                case "PrintAll":
                    for (String item : listIterator) {
                        System.out.print(item + " ");
                    }
                    System.out.println();

                    break;
            }

            input = scanner.nextLine();
        }
    }


}
