public class ValidatePIN {

    /*
    Java: https://connect.revature.net/groups/project-onboarding

        Create a function that will test if a string is a valid PIN or not via a regular expression.

        A valid PIN has:
            Exactly 4 or 6 characters.
            Only numeric characters (0-9).
            No whitespace.

        Examples
        validate("121317") ➞ true

        validate("1234") ➞ true

        validate("45135") ➞ false

        validate("89abc1") ➞ false

        validate("900876") ➞ true

        validate(" 4983") ➞ false

        Notes: Empty strings should return 'false' when tested.
     */

    public static boolean validate(String input) {
        return input != null ? input.matches("[0-9]{4}|[0-9]{6}") : false;
    }



    public static void main(String[] args) {
        String input;
        input = "123456"; System.out.println(input + " " + validate(input));
        input = "12345"; System.out.println(input + " " +  validate(input));
        input = "1234"; System.out.println(input + " " + validate(input));
        input = "aa1234"; System.out.println(input + " " + validate(input));
        input = " 1234"; System.out.println(input + " " + validate(input));
        input = " 1234"; System.out.println(input + " " + validate(input));
        input = "12 34"; System.out.println(input + " " + validate(input));
        input = "123b4"; System.out.println(input + " " + validate(input));

        input = "121317"; System.out.println(input + " " + validate(input));
        input = "1234"; System.out.println(input + " " + validate(input));
        input = "45135"; System.out.println(input + " " + validate(input));
        input = "89abc1"; System.out.println(input + " " + validate(input));
        input = "900876"; System.out.println(input + " " + validate(input));
        input = " 4983"; System.out.println(input + " " + validate(input));
        input = " "; System.out.println(input + " " + validate(input));
        input = ""; System.out.println(input + " " + validate(input));
        input = null; System.out.println(input + " " + validate(input));
    }
}
