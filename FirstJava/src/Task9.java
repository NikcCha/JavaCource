
//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2. Размер массива задается пользователем.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        int xs[] = new int[new Scanner(System.in).nextInt()];

        for (int x = 0; x < xs.length; x++) {
            System.out.println("Введите элемент массива:");
            xs[x] = new Scanner(System.in).nextInt();
        }

        for (Integer i : xs) {
            System.out.println(i * 2);
        }

    }

}
