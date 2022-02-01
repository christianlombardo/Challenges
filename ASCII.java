import java.util.Scanner;

public class ASCII {

    // ASCII Characters https://www.eso.org/~ndelmott/ascii.html

    public static void getASCII(String[] input) {
        int n = input.length;

        String res = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String c = input[i];
            int myChar = Integer.parseInt(c, 16);
            res += (char)myChar;
            sb.append((char) myChar);
        }

        System.out.println(res);
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String[] input = {"48", "65", "6C", "6C", "6F", "20", "57", "6F", "72", "6C", "64"};
        getASCII(input);
    }
}
