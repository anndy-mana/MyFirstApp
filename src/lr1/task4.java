package lr1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количесво дней: ");
        String day = in.nextLine();

        System.out.println(month + " содержит " + day + " день(дней)");
    }
}

