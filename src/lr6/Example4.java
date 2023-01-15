/* Напишите программу, в которой описан статический метод для вычисления
двойного факториала числа, переданного аргументом методу. По определению, двойной
факториал числа n (обозначается как n!!) — это произведение через одно всех чисел, не
больших числа n. То есть n!! = n * (n - 2) * (n - 4)* ... (последний множитель равен 1 для
нечетного n и равен 2 для четного n). Например, 6!! = 6 x 4 x 2 = 48 и 5!! = 5 x 3 х 1 = 15. */


package lr6;

public class Example4 {
    public static void main(String[] args) {
        DoubleFactorial f = new DoubleFactorial();
        int number = 6;
        System.out.println("Рекурсивный метод");
        int fact = f.fact(number);
        System.out.println("Вычисление двойного факториала числа " + number + "!! = "+fact);
        System.out.println("Метод без рекурсии");
        int fact2 = f.fact2(number);
        System.out.println("Вычисление двойного факториала числа " + number + "!! = " + fact2);
    }
    private static class DoubleFactorial {
        private int fact(int n) {
            //это рекурсивный метод
            int result;
            System.out.println("*" + n);
            if (n == 1) return 1;//проверка входного параметра, если равен 1, то выход из метода
            if (n == 2) return 2;//проверка входного параметра, если равен 2, то выход из метода
            result = fact(n - 2) * n;
            return result;
        }

        private int fact2(int n) {
            //это метод без рекурсии

            int result = n;
            int j = n;
            for(int i = n; i > 2; i = i - 2) {
                System.out.println("*" + j);
                j = j - 2;
                result *= j;
            }
            return result;
        }
    }
}
