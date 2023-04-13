import java.util.Scanner;

public class task3 {
  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите выражение, разделяя цифры и знак пробелом(знаки можно использовать + - *): ");
    String aStr = iScanner.next();
    String symbol = iScanner.next();
    String bStr = iScanner.next();
    Integer a = Integer.valueOf(aStr);
    Integer b = Integer.valueOf(bStr);
    switch (symbol) {
      case "+":
        System.out.printf("= %d", a + b);
        break;
      case "-":
        System.out.printf("= %d", a - b);
        break;
      case "*":
        System.out.printf("= %d", a * b);
        break;
      default:
        System.out.println("Чего-то вы не то ввели!");
        break;
    }
  }
}