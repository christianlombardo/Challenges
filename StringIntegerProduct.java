public class StringIntegerProduct {

    public static void stringProduct(String num) {
        int product = 1;
        if (num.trim().length() == 0) {
            product = 0;
        }
        else {
            for (int i = 0; i < num.length(); i++) {
                product *= Integer.parseInt(num.substring(i, i + 1));
            }
        }
        System.out.println(product);
    }

    public static void main(String[] args) {
        stringProduct("23");
        stringProduct("555");
        stringProduct("753");
        stringProduct("");
        stringProduct(" ");
        stringProduct("1234");
        stringProduct("12345");
        stringProduct("932");
    }

}
