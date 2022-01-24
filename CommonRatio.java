public class CommonRatio {

    // https://study.com/academy/lesson/common-ratio-definition-lesson-quiz.html


    public static void commonRatio (int N, int R) {
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        long res = 1;
        System.out.print(res + " ");
        for (int i=1 ; i<N ; i++) {
            res = res * R;
            String space = (i < N-1 ? " " : "");
            System.out.print(res + space);
        }
    }

    public static void commonRatio2 (int N, int R) {
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        for (int i=0 ; i<N ; i++) {
            String space = (i < N-1 ? " " : "");
            System.out.print(Math.round(Math.pow(R, i)) + space);
        }
    }


    public static void main(String[] args) {
        commonRatio(7, 42);
        System.out.println();
        commonRatio2(7, 42);
    }
}
