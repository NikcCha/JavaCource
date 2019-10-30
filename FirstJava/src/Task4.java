//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат,
// записать в переменную int и вывести на экран.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int x = Integer.parseInt(a, 2);
        System.out.println(x);
    }

}
