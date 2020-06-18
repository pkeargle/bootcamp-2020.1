/**
 * 
 * Description:
 *  Given a string, find the longest substring which is palindrome. 
 *  For example, if the given string is "ababad", the output should be "ababa"
 *
 */
public class StudentLongPalinSubStr {
    private static boolean isPalindrome(String palin) {
      StringBuilder s = new StringBuilder();
      s.append(palin);
      s = s.reverse();
      String temp = s.toString();
      return palin.equals(temp);
    }

    private static String findLongestPalinSubstring(String str) {
      if (str == null) {
        throw new IllegalArgumentException("This an illegal argument: " + str);
      }

      if (str.length() < 2) {
        return str;
      }

      String palindrome = "";
        for (int i = str.length(); i > 0; i--) {
            for (int j = 0; j <= str.length() - i; j++) {
            palindrome = str.substring(j, j+i);
            if (isPalindrome(palindrome)) {
              return palindrome;
            }
          }
        }
      return str.substring(0, 1);
    }
    public static void main(String[] args) {
      String test = "ababad";
      System.out.println("The longest palindrome substring is: " + 
        findLongestPalinSubstring(test));
    }
}
