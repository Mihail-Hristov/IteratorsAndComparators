package Lake;

import Lake.Lake;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Lake stones = null;

        while (!"END".equals(input)){
            int[] numbersOfLake = Arrays.stream(input.split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            stones = new Lake(numbersOfLake);

            input = scanner.nextLine();
        }

        for (int stones1 : stones) {
            System.out.print(stones1 + " ");
        }

    }
}
