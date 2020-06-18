/**
*
* Description:
*  Given a string, find the longest substring which is palindrome. 
*  For example, if the given string is "ababad", the output should be "ababa"
*
* Dynamic approach using multi-dimensional array
*
* Definition of 2D array
*   A 2D array has a type such as int[][], String[][] or boolean[][], with two pairs 
*   of square brackets. The elements of a 2D array are arranged in rows and columns, 
*   and the new operator for 2D arrays specifies both the number of rows and the 
*   number of columns.
* 
* Refer to "longPalinSubStr.xlsx" for reference and logic flow
*
*/
public class LongPalinSubStr {
    private static String findLongestPalinSubstring(String str) {
      // Declare and set len variable to 0 
      int len = 0;

      /**
       * Check for spaces in string. Remove if any found. Then string set 
       * length.
       */
      if (str.contains(" ")) {
        // Java regex regular-expression : https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        str = str.replaceAll("\\s", "");
        len = str.length();
      } else {
        len = str.length();
      }

      // Set variables for longest palindrome in string, start and end index in array
      int longestPalin = 0, start = 0, end = 0;

      // Check if string is empty (Refer to testcases)
      if (!str.equals("")) {
        // Declare new boolean 2D array ([row][column])
        boolean[][] isPalindrome = new boolean[len][len];
      
        for (int p = 0; p < len; p++) {
          // Set isPalindrone is true where [p][p] = [rowIndex][columnIndex] are equal
          // interatoring through string
          System.out.println("p is at index: " + p);
          isPalindrome[p][p] = true;
          System.out.println("isPalindrome is: " + isPalindrome[p][p]);
          for (int k = 0; k < p; k++) {
            // Check whether character at k and p index are equal
            // and
            // p-k is less then or equal to 2
            // OR
            // isPalindrome are at an index where k and p characters are equal?
            if (str.charAt(k) == str.charAt(p) && (p-k <= 2 || isPalindrome[k+1][p-1])) {
              isPalindrome[k][p] = true;
              // Start search for longest Palindrone substring by checking length of current
              // palindrome is greater than longest palindrome found in string
              System.out.println("k is at index: " + k);
              System.out.println("p is at index: " + p);
              if (p-k+1 > longestPalin) {
                longestPalin = p - k + 1;
                System.out.println("longestPalin is at " + "p[" + p + "]" + " - " + "k[" + k + "] + 1 = " + longestPalin + " | character is: " + str.charAt(longestPalin));
                start = k;
                System.out.println("k is at index: " + k + " | character is: " + str.charAt(k));
                end = p;
                System.out.println("p is at index: " + p + " | character is: " + str.charAt(p));
              }  
            }
          }
        }
      } else {
          throw new IllegalArgumentException("Please input a valid string.");
      }
        System.out.println("start is: " + start + " | end is: " + end);
        return str.substring(start, end+1);
    }
    // Main
    public static void main(String[] args) {
      /** 
       * Testcases:
       *   1. ababad -> ababa
       *   2. racecaronradar -> racecar (has two palindromes - refer to spreadsheet : longPalinSubStr.xlsx)
       *   3. Hellomynameisnoon -> noon
       *   4. I went to my gym other than yours -> tomygymot
       *   5. works -> w (returns the first character as the palindrome)
       *   6. Empty string --> will throw IllegalArgumentException
       *   7. Empty space only -> will throw IllegalArgumentException
       *   8. null -> will throw NullPointerException
       */
      
      // Test code
      String findPalin = "racecaronradar";
      try {
      System.out.println("The longest palindrome substring is: " + 
        findLongestPalinSubstring(findPalin));
        } catch (NullPointerException e) {
          System.out.println("NullPointerException");
      }
    }
  }
  