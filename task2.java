import java.util.*;

public class task2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> countMap = new HashMap<>();
        for (String employee : employees) {
            countMap.put(employee, countMap.getOrDefault(employee, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
