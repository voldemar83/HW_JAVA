public class task4 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        int[] values = new int[2]; // массив для хранения значений замененных знаков вопроса

        // перебор всех возможных значений для знаков вопроса
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                // замена знаков вопроса на значения из текущей итерации цикла
                String eq = equation.replaceFirst("\\?", Integer.toString(i)).replaceFirst("\\?", Integer.toString(j));
                String[] parts = eq.split("[+\\-=]"); // разбиение выражения на части

                // проверка, является ли каждая часть числом и преобразование ее в число
                boolean valid = true;
                for (int k = 0; k < parts.length; k++) {
                    if (!parts[k].matches("\\d+")) {
                        valid = false;
                        break;
                    }
                    values[k] = Integer.parseInt(parts[k]);
                }

                // выполнение вычислений и проверка, равно ли полученное значение ожидаемому
                if (valid && (values[0] + values[1] == Integer.parseInt(parts[2]))) {
                    System.out.printf("%d%s + %d%s = %s\n", i, j, values[0], values[1], parts[2]);
                    return;
                }
            }
        }

        System.out.println("Решение не найдено");
    }
}