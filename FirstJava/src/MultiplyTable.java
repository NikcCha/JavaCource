//Необходимо вывести на экран таблицу умножения от 1 до 10
// для введённого пользователем любого числа. Использовать циклы запрещено.
import java.util.Scanner;


public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x+"*1="+x);
        System.out.println(x+"*2="+x*2);
        System.out.println(x+"*3="+x*3);
        System.out.println(x+"*4="+x*4);
        System.out.println(x+"*5="+x*5);
        System.out.println(x+"*6="+x*6);
        System.out.println(x+"*7="+x*7);
        System.out.println(x+"*8="+x*8);
        System.out.println(x+"*9="+x*9);
        System.out.println(x+"*10="+x*10);

    }

}
