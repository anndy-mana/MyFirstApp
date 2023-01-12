package lr1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Input firstName: ");
        String firstName = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input secondName: ");
        String secondName = in.nextLine();

        System.out.println("First Name: " + firstName);
        System.out.println("Name: " + name);
        System.out.println("Second Name: " + secondName);
        in.close();

    }
}
