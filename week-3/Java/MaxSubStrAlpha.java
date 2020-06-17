/**
 * 
 * Description:
 *  Given a string determine the alphabetical maximum substring
 *  For example, if the given input -> "banana" The alphabetically-ordered set of
 *  unique substrings of is: [a, an, ana, anan, anan, anana, b, ba, ban,
 *  bana, banan, banana, n, na, nan] -> max is "nana"
 * 
 * Flow:
 *  The unique substrings: [b, ba, bac, baca, a, ac, aca, c, ca]
 *  Arranging the substrings alphabetically: [a, ac, aca, b, ba, bac, baca, c, ca]
 *  The maximum substring alphabetically: ca
 *
 */
public class MaxSubStrAlpha {
  public static String findMaxSubStringAlpha(String str) {
    // Loop to find the maximum alphabetical substring in
    // the substring array 
    String s = ""; 
    for (int i = 0; i < str.length(); ++i) { 
      // Using the compareTo method to compare each substring in array
      // source : https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
      if (s.compareTo(str.substring(i)) <= 0) { 
          s = str.substring(i); 
          System.out.println("The string is: " + s);
      } 
    } 

    return s; 
  }
   // Main
  public static void main(String[] args) {
    /** 
     * Testcases:
     *  1. baca -> ca
     *  2. ba -> ba
     *  3. aaa -> aaa
     *  4. banana -> nana
     */
    String str = "banana";
    System.out.println("The alphabetical maximim substrings are: " + findMaxSubStringAlpha(str));
    
    }
}