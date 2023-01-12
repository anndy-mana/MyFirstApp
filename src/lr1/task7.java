package lr1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int birthyear = in.nextInt();
        birthyear = 2023 - birthyear;

        System.out.println("Поздравляю, вы родились в " + birthyear + " году :)");
    }
}
