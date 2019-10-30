//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String First;
        try (BufferedReader rdr = new BufferedReader(new FileReader("test.txt"))){
            while ((First=rdr.readLine()) !=null){
                System.out.println(First);
            }
        }
        catch (IOException exception){
            System.out.println("Ошибка ввода-вывода: " + exception);
        }
    }
}

