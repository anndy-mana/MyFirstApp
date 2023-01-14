package lr4;

public class Example2 {
    public static void main(String[] args) {
        int str = 5; // строки
        int row = 5; // столбцы
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < row; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}