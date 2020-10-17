package CustomStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        CustomStack stack = new CustomStack();

        while (!"END".equals(input)) {
            String[] tokens = input.split("\\s+", 2);
            String command = tokens[0];

            switch (command) {
                case "Push":
                    String[] elements = tokens[1].split(", ");
                    for (int i = 0; i < elements.length; i++) {
                        stack.push(elements[i]);
                    }

                    break;
                case "Pop":
                    stack.pop();

                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (String element : stack) {
                System.out.println(element);
            }
        }
    }
}
