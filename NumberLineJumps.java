public class NumberLineJumps {

    // https://www.hackerrank.com/contests/staging-2022/challenges/kangaroo

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = "NO";

        // base case
        if ( (x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1) ) {
            return "NO";
        } else if ((x1 == x2 && v1 > v2) || (x2 == x1 && v2 > v1)) {
            return "NO";
        } else if ((x1 > x2 && v1 == v2) || (x2 > x1 && v2 == v1)) {
            return "NO";
        }

        int kangaroo1 = x1;
        int kangaroo2 = x2;
        while (kangaroo1 != kangaroo2) {
            kangaroo1 += v1;
            kangaroo2 += v2;

            if (kangaroo1 == kangaroo2)
                result = "YES";

            System.out.println("kangaroo1 = " + kangaroo1 + ", " + "kangaroo2 = " + kangaroo2);
        }

        return result;

    }


    public static String kangaroo2(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = "NO";

        // base case
        if ( (x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1) ) {
            return "NO";
        } else if ((x1 == x2 && v1 > v2) || (x2 == x1 && v2 > v1)) {
            return "NO";
        } else if ((x1 > x2 && v1 == v2) || (x2 > x1 && v2 == v1)) {
            return "NO";
        }

        int kangaroo1 = x1;
        int kangaroo2 = x2;
        while (kangaroo1 != kangaroo2) {
            kangaroo1 += v1;
            kangaroo2 += v2;

            if (kangaroo1 == kangaroo2)
                result = "YES";

            if ( (kangaroo1 > kangaroo2 && v1 > v2) || (x2 > kangaroo1 && kangaroo2 > v1) ) {
                return "NO";
            } else if ((kangaroo1 == kangaroo2 && v1 > v2) || (x2 == kangaroo1 && v2 > kangaroo2)) {
                return "NO";
            } else if ((kangaroo1 > kangaroo2 && v1 == v2) || (x2 > kangaroo1 && kangaroo2 == v1)) {
                return "NO";
            }

            System.out.println("kangaroo1 = " + kangaroo1 + ", " + "kangaroo2 = " + kangaroo2);
        }

        return result;
    }

    public static String kangaroo3(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result = "NO";

        // base case
        if ( (x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1) ) {
            return "NO";
        } else if ((x1 == x2 && v1 > v2) || (x2 == x1 && v2 > v1)) {
            return "NO";
        } else if ((x1 > x2 && v1 == v2) || (x2 > x1 && v2 == v1)) {
            return "NO";
        }

        while (x1 != x2) {
            x1 += v1;
            x2 += v2;

            if (x1 == x2)
                result = "YES";

            if ( (x1 > x2 && v1 > v2) || (x2 > x1 && x2 > v1) ) {
                result =  "NO";
            } else if ((x1 == x2 && v1 > v2) || (x2 == x1 && v2 > x2)) {
                result = "NO";
            } else if ((x1 > x2 && v1 == v2) || (x2 > x1 && x2 == v1)) {
                result = "NO";
            }

            System.out.println("kangaroo1 = " + x1 + ", " + "kangaroo2 = " + x2);
        }

        return result;
    }

    public static String kangaroo4(int x1, int v1, int x2, int v2) {
        // Write your code here
        String result;

        if (x1 > x2) {
            if (v2 > v1) {
                while (true) {
                    x1 += v1;
                    x2 += v2;

                    if (x1 == x2) {
                        result = "YES";
                        break;
                    } else if (x2 > x1) {
                        result = "NO";
                        break;
                    }
                }
            }
            else {
                result = "NO";
            }
        }
        else if (x2 > x1) {
            if (v1 > v2) {
                while (true) {
                    x1 += v1;
                    x2 += v2;

                    if (x1 == x2) {
                        result = "YES";
                        break;
                    } else if (x1 > x2) {
                        result = "NO";
                        break;
                    }
                }
            }
            else
                result = "NO";
        }
        else { // x1 == x2
            if (v1 == v2)
                result = "YES";
            else
                result = "NO";
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(kangaroo4(0, 3, 4, 2));
    }

}
