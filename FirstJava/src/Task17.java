//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
// Пользователь при тестировании программы по правилу черного ящика должен понимать,
// какой принцип остановки записи в файл он должен подать.

import java.io.*;


public class Task17 {
    public static void main(String[] args) {
        String First;
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст для записи в файл: ");
        System.out.println("Командой для остановки является строка 'stop' ");

        try (FileWriter wrtr = new FileWriter("test.txt")) {
            do {
                System.out.println(": ");
                First = rdr.readLine();

                if (First.compareTo("stop") == 0) break;
                First = First + "\r\n";
                wrtr.write(First);
            }
            while (First.compareTo("stop") != 0);
        }
        catch(IOException exception){
            System.out.println("Ошибка ввода-вывода: " + exception);
        }
    }
}

