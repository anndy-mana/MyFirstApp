package lr1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите year рождения: ");
        int birthyear = in.nextInt();
        birthyear = 2023 - birthyear;

        System.out.println("Поздравляю, " + name + ", вам " + birthyear + " годик(-ов):)");
    }
}

