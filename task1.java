import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите последовательность цифр через пробел: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        for (String number : numbers) {
            deque.add(Integer.parseInt(number));
        }

        if (checkOn(deque)) {
            System.out.println("Последовательность является палиндромом");
        } else {
            System.out.println("Последовательность не является палиндромом");
        }
    }

    /**
     * Метод проверяет, является ли последовательность цифр в Deque палиндромом.
     *
     * @param deque Deque с последовательностью цифр
     * @return true, если последовательность является палиндромом, иначе - false
     */
    public static boolean checkOn(Deque<Integer> deque) {
        // Создаем копию Deque, т.к. будем извлекать элементы из начала и конца очереди и портить оригинальную
        Deque<Integer> copyDeque = new ArrayDeque<>(deque);

        // Пока в Deque остались элементы
        while (copyDeque.size() > 1) {
            // Извлекаем первый и последний элементы
            int first = copyDeque.pollFirst();
            int last = copyDeque.pollLast();

            // Если они не равны, то последовательность не является палиндромом
            if (first != last) {
                return false;
            }
        }

        // Если метод не вышел из цикла, значит последовательность является палиндромом
        return true;
    }
}