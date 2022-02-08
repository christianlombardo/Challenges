public class AscendingNumbers {

    /*
    1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

    Examples
        ascending("232425") --> true
        // Consecutive numbers 23, 24, 25

        ascending("2324256") --> false
        // No matter how this string is divided, the numbers are not consecutive.

        ascending("444445") --> true
        // Consecutive numbers 444 and 445.

    Notes
        A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them.
     */

    public static boolean containsAscending(String num) {
        int digits = 1;
        int current;
        int next;

        while (digits <= num.length()/2) {
            if (num.length() % digits == 0) {
                current = Integer.parseInt(num.substring(0, digits));
                for (int i = digits; i < num.length(); i += digits) {
                    next = Integer.parseInt(num.substring(i, digits + i));
                    if (current <= next) {
                        if (i == num.length() - digits) {
                            return true;
                        }
                        current = next;
                    }
                    else {
                        break; // current is > next, therefore break out of for loop then increment digits below.
                    }
                }
            }

            digits++;

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("containsAscending(232425) " + containsAscending("232425"));
        System.out.println("containsAscending(123456) " + containsAscending("123456"));
        System.out.println("containsAscending(2324256) " + containsAscending("2324256"));
        System.out.println("containsAscending(444445) " + containsAscending("444445"));
        System.out.println("containsAscending(2324256) " + containsAscending("653724956"));
        System.out.println("containsAscending(2324256) " + containsAscending("953724356"));
    }

}
