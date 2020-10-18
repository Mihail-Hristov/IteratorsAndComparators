package Lake;

import Lake.Lake;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Lake stones = null;
        int count = 0;

        while (!"END".equals(input)){
            int[] numbersOfLake = Arrays.stream(input.split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            count = numbersOfLake.length;

            stones = new Lake(numbersOfLake);

            input = scanner.nextLine();
        }

        for (int stones1 : stones) {
            if (count > 1) {
                System.out.print(stones1 + ", ");
                count --;
            }else {
                System.out.println(stones1);
            }
        }

    }
}
