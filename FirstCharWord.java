public class FirstCharWord {

    // Apache Common implementation of isBlank https://gist.github.com/fmjrey/deb8eaeee85cab005ff2
    public static boolean isBlank(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    public static void printfirstCharWord (String T) {

        if (isBlank(T)) {  // Java 11
            System.out.print(" ");
        }
        else{
            System.out.print(T.charAt(0));
            if (T.charAt(0) ==  '.') {
                return;
            }
        }
    }


    public static void main(String[] args) {
        printfirstCharWord("Hello World");
        printfirstCharWord("Intelligent");
        printfirstCharWord("");
        printfirstCharWord("Coool");
        printfirstCharWord("Ommm");
        printfirstCharWord("Ommm");
        printfirstCharWord("LOVE");
        printfirstCharWord(".");
    }
}
