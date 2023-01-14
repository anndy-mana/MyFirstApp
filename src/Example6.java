/*
6. Напишите программу, в которой создается одномерный числовой
        массив и заполняется числами, которые при делении на 5 дают в остатке 2
        (числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
        Предусмотреть обработку ошибки, связанной с вводом некорректного
        значения.*/


package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемое колличество цифр: ");

        if(in.hasNextInt()) {
            int a = in.nextInt();
            int[] arr1 = new int[a];
            int b = 0;
            int count = 0;

            while (count < a) {
                b++;
                if (b % 5 == 2) {
                    arr1[count] = b;
                    count++;
                }
            }
            System.out.print("Вывод из массива :");
            for (int j : arr1) {
                System.out.print(" " + j);
            }
            in.close();
        } else {
            System.out.println("Ошибка. Введите цифру или число.");
        }
    }
}
