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
    // Check if string is empty (Refer to testcases)
    if (!str.equals("")) {

      // Loop to find the maximum alphabetical substring in
      // the substring array 
      String s = ""; 
      for (int i = 0; i < str.length(); ++i) { 
        // Using the compareTo method to compare each substring in array
        // source : https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        if (s.compareTo(str.substring(i)) <= 0) { 
            s = str.substring(i); 
            // See how we get there
            System.out.println("The string is: " + s);
        } 
      } 

      return s; 
    } else {
      throw new IllegalArgumentException("Please input a valid string.");
    }
  }
   // Main
  public static void main(String[] args) {
    /** 
     * Testcases:
     *  1. baca -> ca
     *  2. ba -> ba
     *  3. aaa -> aaa
     *  4. banana -> nana
     *  5. basketball -> tball
     *  6. <empty> -> Please input a valid string.
     *  7. null -> return null exeception
     */
    // Test code
    String str = null;
    try {
    System.out.println("The alphabetical maximim substrings are: " + findMaxSubStringAlpha(str));
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }
}