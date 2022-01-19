// 01+18+2022 Onboarding https://connect.revature.net/groups/project-onboarding
/*
    In Text Twist, players try to score points by forming words using the letters from a 6-letter scrambled word. They win the round if they can successfully unscramble the 6-letter word.

    Create a function that takes in an array of already-guessed words, the unscrambled 6-letter word and returns the total number of points the player scored in a particular round using the following rubric:

    3-letter words are 1 pt
    4-letter words are 2 pts
    5-letter words are 3 pts
    6-letter words are 4 pts + 50 pt bonus (for unscrambling the word)
    Remember that invalid words (words that cannot be formed from the 6-letter unscrambled words) count as 0 pts.

    Examples
    totalPoints(["cat", "create", "sat"], "caster") ➞ 2
    // Since "create" is an invalid word.

    totalPoints(["trance", "recant"], "recant") ➞ 108
    // Since "trance" and "recant" score 54 pts each.

    totalPoints(["dote", "dotes", "toes", "set", "dot", "dots", "sted"], "tossed") ➞ 13
    // Since 2 + 3 + 2 + 1 + 1 + 2 + 2 = 13

    Notes:
    If a 6-letter word has multiple anagrams, count each 6-letter unscramble as an additional 54 pts. For example, if the word is arches, and the player guessed arches and chaser, add 108 pts for both words.
 */

public class TextTwist {

    private static final int ALPHABET = 128;

    // https://introcs.cs.princeton.edu/java/31datatype/TextTwist.java.html


    // return number of each character in the word
    public static int[] numOfEachChar(String s) {
        int[] wordCharsCount = new int[ALPHABET];
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i) + " ascii " + (int)s.charAt(i));
            ++wordCharsCount[s.charAt(i)];
        }
        return wordCharsCount;
    }

    // check if the two words are equal
    public static boolean equal(int[] word1, int[] word2) {
        for (int i = 0; i < ALPHABET; i++)
            if (word1[i] < word2[i])
                return false;

        return true;
    }

    public static int totalPoints(String[] guessedWords, String inputWord) {
        int totalPoints = 0;

        inputWord = inputWord.toLowerCase();
        int[] numChars_mainWord = numOfEachChar(inputWord);

        String guessedWord;

        for (int i = 0; i<guessedWords.length ; i++) {
            guessedWord = guessedWords[i].toLowerCase();

            int elligiblePoint = 0;
            if (guessedWord.length() <= inputWord.length()) {

                switch (guessedWord.length()) {
                    case 3:
                        elligiblePoint = 1;
                        break;
                    case 4:
                        elligiblePoint = 2;
                        break;
                    case 5:
                        elligiblePoint = 3;
                        break;
                    case 6:
                        elligiblePoint = 54;
                        break;
                }

                // count number of each character in the word
                int[] numChars_guessedWord = numOfEachChar(guessedWord);

                // check if the two words are equal
                if (equal(numChars_mainWord, numChars_guessedWord))
                    totalPoints += elligiblePoint;
            }
        }

        return totalPoints;
    }


    public static void main(String[] args) {
        System.out.println(totalPoints(new String[]{"trance", "recant"}, "recant"));
        System.out.println(totalPoints(new String[]{"zooom", "moooz"}, "omooz"));
        System.out.println(totalPoints(new String[]{"ample", "pleam"}, "elmpa"));

    }
}
