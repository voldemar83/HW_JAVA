public class task1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей
    // строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”
    public static String shuffle(final String s, final int[] index) {
      String result = "";
      char[] resArray = new char[s.length()];
      for (int i = 0; i < s.length(); i++) {
        resArray[index[i]] = s.charAt(i);
      }
      for (char c : resArray) {
        result += c;
      }
      return result;
    }
  
    public static void main(String[] args) {
      String s = "cba";
      int[] index = { 2, 1, 0 };
      String result = shuffle(s, index);
      System.out.println(result);
    }
  
  }