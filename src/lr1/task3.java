package lr1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String day = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Число: ");
        String dayOf = in.nextLine();

        System.out.println("Сегодня: " + day + ", " + dayOf + " " + month);

    }
}