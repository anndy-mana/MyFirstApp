package lr1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите year рождения: ");
        int birthyear = in.nextInt();
        birthyear = 2023 - birthyear;

        System.out.println("Поздравляю, вам: " + birthyear + " годик(-ов):)");
    }
}

