public class TimeConversion {

    /*

        Time Conversion https://www.hackerrank.com/contests/staging-2022/challenges/time-conversion

        Given a time in hour AM/PM format, convert it to military (24-hour) time.

        Note:   * 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
                * 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

        Example

        Return '12:01:00'.

            Return '00:01:00'.

        Function Description

        Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

        timeConversion has the following parameter(s):

            string s: a time in

            hour format

        Returns

            string: the time in

            hour format

        Input Format

        A single string
        that represents a time in -hour clock format (i.e.: or

        ).

        Constraints

            All input times are valid

        Sample Input 0

        07:05:45PM

        Sample Output 0

        19:05:45

     */

    public static String zeroString(Integer value) {
        return (value < 10 ? "0" + value : "" + value);
    }

    public static String timeConversion(String s) {
        // Example
        //      '12:01:00PM' ===> Return '12:01:00'.
        //      '12:01:00AM' ===> Return '00:01:00'.
        //       0123456789

        Integer hour =    Integer.parseInt(s.substring(0,2));
        Integer minute =  Integer.parseInt(s.substring(3,5));
        Integer second = Integer.parseInt(s.substring(6,8));
        String result = "";
        if (s.contains("AM") && hour == 12) {
            result = "00:" + zeroString(minute) + ":" + zeroString(second);
        }
        else if (s.contains("AM") && hour <= 11) {
            result = s.replace("AM", "");
        }
        else { // PM
            if (hour <= 11) {
                hour += 12;
            }

            result = "" + hour + ":" + zeroString(minute) + ":" + zeroString(second);
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
