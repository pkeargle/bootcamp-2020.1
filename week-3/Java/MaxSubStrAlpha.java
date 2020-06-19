/**
 * 
 * Description:
 *  Given a string determine the alphabetical maximum substring
 *  For example, if the given input -> "banana" The alphabetically-ordered set of
 *  unique substrings of is: [a, an, ana, anan, anana, b, ba, ban,
 *  bana, banan, banana, n, na, nan] -> max is "nana"
 * 
 * Flow: (input baca)
 *  The unique substrings: [b, ba, bac, baca, a, ac, aca, c, ca]
 *  Arranging the substrings alphabetically: [a, ac, aca, b, ba, bac, baca, c, ca]
 *  The maximum substring alphabetically: ca
 *
 */
public class MaxSubStrAlpha {
  public static String findMaxSubStringAlpha(String str) {
    // Lowercase string
    str = str.toLowerCase();

    // Check if string is empty and not greater then 100 (contraints)
    if (!str.equals("") && str.length() <= 100) {
      // Loop to find the maximum alphabetical substring in given string
      String s = "";
      for (int i = 0; i < str.length(); i++) { 
        // Using the compareTo method to compare each substring in array
        // source : https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        if (s.compareTo(str.substring(i)) <= 0) { 
          s = str.substring(i); 
        } 
        // See how we get there
        System.out.println("The string is: " + s);
        System.out.println("=========================================");
      }

      return s;
    } else {
      throw new IllegalArgumentException("Please input a valid string.");
    }
  }

  public static String bananaStrAsciiExample(String str) {
    String charAscii = "";

    // Lowercase string
    str = str.toLowerCase();

    /**
     * For demostration purposes:
     *   Get ascii value for each character 
     *   Source : http://www.asciitable.com/
     */
    // Check if string is empty and not greater then 100 (contraints)
    if (!str.equals("") && str.length() <= 100) {
      System.out.println("========= Show ascii comparsion =========");
      for (int j = 0; j < str.length(); j++) {
        charAscii = str;
        // Get current character
        char currCharacter = charAscii.charAt(j);
        if (str.indexOf(currCharacter, j) < str.length() - 1) {
          int currAscii = (int) currCharacter;
          System.out.println("=========================================");
          System.out.println("Current character is: " + currCharacter + " | ascii value is: " + currAscii);
          // Get next character
          char nextCharacter = charAscii.charAt(j+1);
          int nextAscii = (int) nextCharacter;
          System.out.println("Next character is: " + nextCharacter + " | ascii value is: " + nextAscii);
          // Check if ascii current character is greater then next
          if (currAscii > nextAscii) {
            int currIndex = str.indexOf(currCharacter, j);
            char maxChar = currCharacter;
            int maxAscii = (int) maxChar;
            for (int k = currIndex; k < (str.length() - 1) - currIndex;  k++) {
              nextCharacter = charAscii.charAt(k+1);
              System.out.println("nextCharacter is: " + nextCharacter);
              nextAscii = (int) nextCharacter;
              if (maxAscii > nextAscii) {
                int maxIndex = str.indexOf(maxChar);
                System.out.println("=========================================");
                System.out.println("Character : " + maxChar + " | ascii value is: " + maxAscii + 
                  " and is greater then next character: " + nextCharacter + " | ascii value is: " + nextAscii);
                System.out.println("Maximum substring is now starting at character: " + maxChar + 
                " | index: " + maxIndex);
              } else {
                maxChar = nextCharacter;
              }
              j = k;
            }
          }
        }
      }
    }
    return charAscii;
  }

   // Main
  public static void main(String[] args) {
    /** 
     * Testcases:
     *  1. baca -> ca
     *  2. ba -> ba
     *  3. aaa -> aaa
     *  4. banana -> nana
     *  5. information -> tion
     *  6. <empty> -> Please input a valid string.
     *  7. null -> return null exeception
     */
    // Test code
    String str = "banana";
    // To show how maximum substring is found (ascii [a-z])
    bananaStrAsciiExample(str);
    System.out.println("=========================================");
    System.out.println("The alphabetical maximim substring is: " + findMaxSubStringAlpha(str));
  }
}