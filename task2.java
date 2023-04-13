import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task2 {
   public static void main(String[] args) {
      // Создаем объект Scanner для считывания ввода от пользователя
      Scanner scanner = new Scanner(System.in);
      // Запрашиваем у пользователя размер массива
      System.out.print("Введите размер массива: ");
      int size = scanner.nextInt();
      // Создаем объект Random для генерации случайных чисел
      Random random = new Random();
      // Создаем список целых чисел
      List<Integer> numbers = new ArrayList<>();
      // Заполняем список случайными числами от 0 до 99
      for (int i = 0; i < size; i++) {
          int randomNumber = random.nextInt(100); // Генерируем число от 0 до 99
          numbers.add(randomNumber);
      }

      // Вывод исходного списка
      System.out.println("Исходный список: " + numbers);

      // Удаление четных чисел из списка
      for (int i = 0; i < numbers.size(); i++) {
          if (numbers.get(i) % 2 == 0) { // Если число четное
              numbers.remove(i); // Удаляем его из списка
              i--; 
          }
      }

      // Вывод списка без четных чисел
      System.out.println("Список без четных чисел: " + numbers);
   } 
}