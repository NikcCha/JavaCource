//Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//2. Конвертация строковой переменной S в числовую переменную X типа int
//3. Конвертация числа X типа int в число Y типа double
//Все три числа разных типов необходимо в столбик вывести на экран

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String S = scanner.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);

    }
}
