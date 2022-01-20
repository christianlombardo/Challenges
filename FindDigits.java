public class FindDigits {

    // Find Digits https://www.hackerrank.com/contests/staging-2022/challenges/find-digits

    public static int findDigits(int n) {
        int[] digits = new int[String.valueOf(n).length()];

        int count=0;
        int num = n;
        while (num > 0) {
            digits[count] = num % 10;
            num = num / 10;
            count++;
        }

        int numDivisors = 0;

        for (int i=0 ; i<digits.length ; i++) {
            if (digits[i] != 0) {
                if (n % digits[i] == 0) {
                    numDivisors++;
                }
            }
        }

        return numDivisors;

    }
    public static void main(String[] args) {

        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));

    }
}
