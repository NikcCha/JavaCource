//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.


import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String a = scanner.nextLine();
        System.out.println("Вы ввели: " + a);
    }
}
