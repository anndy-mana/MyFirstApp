/* Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю. */


package lr6;

public class Example1 {
    public static void main(String[] args) {
        Task11 task = new Task11();
        task.SetField('A');
        task.SetField("B");
        char[] CharArray1 = {'п','р','и','в','е','т'};
        char[] CharArray2 = {'C'};
        task.SetField(CharArray1);
        task.SetField(CharArray2);
    }
}
