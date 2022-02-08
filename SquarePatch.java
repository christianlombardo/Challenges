public class SquarePatch {

    public static void squarePatch(int n) {
        for (int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n ; col++) {
                System.out.print(n + (col == n-1 ? "" : ", ") );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squarePatch(3);
        System.out.println();
        squarePatch(5);
    }

}
