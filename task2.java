import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Размерность: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i ++) {
            System.out.printf("Элемент #"+(i + 1)+": ");
            arr[i] = in.nextInt();
        }

        System.out.printf("На что умножить: ");
        int k = in.nextInt();

        in.close();

        for (int item : arr)
            System.out.println(item * k);
    }
}