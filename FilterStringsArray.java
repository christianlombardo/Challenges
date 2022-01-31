import java.util.ArrayList;
import java.util.List;

public class FilterStringsArray {

    /*
    Problem 1. Filter Out Strings from an Array
    Create a function that takes an array of non-negative integers and strings and returns a new array without the strings.

    Examples
        filterArray([1, 2, "a", "b"]) ➞ [1, 2]
        filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
        filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]

    Notes
        Zero is a non-negative integer.
        The given array only has integers and strings.
        Numbers in the array should not repeat.
        The original order must be maintained.
     */

    public static Integer[] filterStringsArray(Object[] input) {
        List<Integer> result = new ArrayList();

        for (int i = 0; i<input.length ; i++) {
            if (input[i] instanceof java.lang.Integer) {
                System.out.println(input[i] + " is an Integer.");
                result.add((Integer)input[i]);
            }
        }

        return result.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Object[] input = new Object[]{"Coolio", 1, 123, "1234", "8", 777};

        Integer[] result = filterStringsArray(input);
        for (int i=0 ; i<result.length ; i++) {
            System.out.print(result[i] + ((i==result.length-1) ? "" : ", "));
        }
    }

}
