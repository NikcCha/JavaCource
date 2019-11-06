//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
// записать в переменную int и вывести на экран. Необходимо использовать циклы,
// нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class Finale1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        int x = scanner.nextInt();
        int dec = 0, p= 0;
        while (x!=0){
            dec +=((x % 10) * Math.pow(2, p));
            x= x / 10;
            p++;
        }
        System.out.println(dec);
    }
}