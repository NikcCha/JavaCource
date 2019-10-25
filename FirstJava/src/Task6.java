//        1. Ввод трех чисел с клавиатуры x, y, z
//
//        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
//
//        3. Деление среднего арифметического на 2 без остатка
//
//        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int middle = (x+y+z)/3;
        if (middle/2>3)
            System.out.println("Программа выполнена корректно");
        else
            System.out.println("Программа выполнена не корректно");
    }
}
