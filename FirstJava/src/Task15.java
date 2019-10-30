//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Использовать пузырьковый метод сортировки.

public class Task15 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 7, 54, 3, 5, 645, 9};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}