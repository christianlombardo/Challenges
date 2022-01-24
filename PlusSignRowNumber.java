public class PlusSignRowNumber {

    public static void plusSignRowNumber(int n) {

        for (int x=0 ; x < n ; x++) {
            for(int y=0 ; y < n ; y++) {
                if (y < x) {
                    System.out.print("+");
                }
                else {
                    System.out.print(y - x + 1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        plusSignRowNumber(4);

        System.out.println();
        plusSignRowNumber(10);

    }
}
