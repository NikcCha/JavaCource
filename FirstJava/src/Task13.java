//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.


import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String a = scanner.nextLine();
        int a1 = a.length();
        System.out.println("Введите вторую строку:");
        String b = scanner.nextLine();
        int b1 = b.length();
        if (a1 > b1)
            System.out.println(a);
        else if (a1<b1)
            System.out.println(b);
        else
            System.out.println("Строки равны по размеру");
    }
}