
public class task0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result); // a3B1
    }

    public static String findJewelsInStones(String jewels, String stones) {
        String result = "";
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            for (int j = 0; j < stones.length(); j++) {
                char stone = stones.charAt(j);
                if (jewel == stone) {
                    result += jewel;
                }
            }
        }
        return result;
    }
}