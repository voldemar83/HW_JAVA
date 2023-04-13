import java.util.Scanner;
import java.util.Stack;

 public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку, содержащую только символы '(', ')', '{', '}', '[' и ']': ");
        String inputString = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                System.out.println("Введенная строка логически неправильная");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Введенная строка логически правильная");
        } else {
            System.out.println("Введенная строка логически неправильная");
        }
    }
}
