//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)


import java.util.Scanner;

public class Finale3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует конвертер валют КВ-3000");
        System.out.println("Введите текущий курс доллара:");
        float x = scanner.nextFloat();
        System.out.println("Введите сумму в рублях:");
        int y = scanner.nextInt();
        float dollar =  y / x;
        System.out.println("Сумма в долларах:");
        System.out.printf("%.2f", dollar);
    }
}

