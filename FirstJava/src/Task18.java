//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
// Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;

public class Task18 {
    public static void main(String[] args) throws IOException {
        String First;
        int cnt = 0;
        try (BufferedReader rdr = new BufferedReader(new FileReader("test.txt"))) {
            while ((First = rdr.readLine()) != null) {
                System.out.println(First);
                cnt++;
            }
        } catch (IOException exception) {
            System.out.println("Ошибка ввода-вывода: " + exception);
        }

        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст для записи в файл: ");
        String Scd;
        int cnt2 = 0;

        try (FileWriter wrtr = new FileWriter("test.txt")) {
            do {
                System.out.println(": ");
                Scd = rdr.readLine();

                if (cnt == cnt2) break;
                Scd = Scd + "\r\n";
                wrtr.write(Scd);
                cnt2++;
            }
            while (cnt!=cnt2);
        } catch (IOException exception) {
            System.out.println("Ошибка ввода-вывода: " + exception);
        }
    }
}