public class MultiplyBy11 {

    /*
    Problem 2 : Multiply by 11
    Given a positive number as a string, multiply the number by 11 and also return it as a string. However, there is a catch:

    You are NOT ALLOWED to simply cast the numeric string into an integer!

    Now, how is this challenge even possible? Despite this, there is still a way to solve it, and it involves thinking about how someone might multiply by 11 in their head. See the tips below for guidance.

    Examples
        multiplyBy11("11") ➞ "121"
        multiplyBy11("111111111") ➞ "1222222221"
        multiplyBy11("1213200020") ➞ "13345200220"
        multiplyBy11("1217197941") ➞ "13389177351"
        multiplyBy11("9473745364784876253253263723") ➞ "104211199012633638785785900953"
     */

    public static String multiplyBy11(String input) {
        Integer result;

        String input2 = input + "0";
        StringBuilder output = new StringBuilder();
        Integer carryover = 0;
        Integer resultLength = 0;
        for (int i=input2.length()-1 ; i>=0 ; i--) {
            result =  (i == 0 ? 0 : Integer.parseInt(input.substring(i-1, i))) + Integer.parseInt(input2.substring(i, i+1)) + carryover;
            resultLength = String.valueOf(result).length();
            carryover = resultLength == 1 ? 0 : Integer.parseInt(String.valueOf(result).substring(0,1));
            if (resultLength > 1) {
                output.insert(0, i == 0 ? result : String.valueOf(result).substring(resultLength - 1, resultLength));
            }
            else {
                output.insert(0, result);
            }
        }

        return "" + output;
    }


    public static void main(String[] args) {
        System.out.println("multiplyBy11(11) = " + multiplyBy11("11"));
        System.out.println("multiplyBy11(11) = " + multiplyBy11("123"));
        System.out.println("multiplyBy11(111111111) = " + multiplyBy11("111111111"));
        System.out.println("multiplyBy11(1213200020) = " + multiplyBy11("1213200020"));
        System.out.println("multiplyBy11(1217197941) = " + multiplyBy11("1217197941"));
        System.out.println("multiplyBy11(9473745364784876253253263723) = " + multiplyBy11("9473745364784876253253263723"));
        System.out.println("multiplyBy11(555) = " + multiplyBy11("555"));
    }
}
