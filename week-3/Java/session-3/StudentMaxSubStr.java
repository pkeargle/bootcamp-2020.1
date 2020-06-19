import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Description:
 *  Given a string determine the alphabetical maximum substring
 *  For example, if the given input -> "banana" The alphabetically-ordered set of
 *  unique substrings of is: [a, an, ana, anan, anana, b, ba, ban,
 *  bana, banan, banana, n, na, nan] -> max is "nana"
 *
 */
public class StudentMaxSubStr {

  public static String findMaxSubStr(String str) {
    List <String> list = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        list.add(str.substring(i, j));
      }
    }
    System.out.println("substring is: " + list);
    Collections.sort(list);
    return list.get(list.size() - 1);
  }
   // Main
  public static void main(String[] args) {
    String str = "banana";
    System.out.println("The alphabetical maximim substrings are: " + findMaxSubStr(str));
    
    }
}