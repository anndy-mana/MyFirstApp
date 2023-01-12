package lr1;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input  number: ");
        int second = in.nextInt();
        int first = second - 1;
        int third = second + 1;
        int sum = second * 3;
        int fourth = sum * sum;

        System.out.println(first + " " + second + " " + third + " " + fourth);
    }
}
