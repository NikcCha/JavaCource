//Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
//В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
//со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
//Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X=10;
        int Y=20;
        int Z=30;
        System.out.println("Введите число в переменную number:");
        int number = scanner.nextInt();
        if (number == X || number == Y || number == Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }

}
