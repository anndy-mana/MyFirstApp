package lr1;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int first = in.nextInt();
        System.out.println("Input second number: ");
        int second = in.nextInt();

        int sum = first + second;
        int dif = first - second;

        System.out.println(sum + " " + dif);
    }
}
