/**
*
* Description:
* Given a string str, the task is to print all the permutations of str.
* A permutation is an arrangement of all or part of a set of objects, with
* regard to the order of the arrangement. For example, if given "abb", the
* output should be "abb abb bab bba bab bba".
*
* Included "System.out.println" statements to follow code by reading output
*
*/
public class PermutationFun {
    public static void getPermutation(String str, String perm) {
        // If string is empty then print perm
        if (str.length() == 0) {
            System.out.println(perm + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            // Get char at index i
            char c = str.charAt(i);

            // Rest of the string are excluding the character
            // at the index of i
            String rotateStr = str.substring(0, i) + str.substring(i + 1);
            // Get permuation call
            // Rotation of input string and cancancate perm and c as they are
            // assigned the character at c
            System.out.println("rotateStr is: " + rotateStr + " | perm is: " + perm + " | c is: " + c);
            getPermutation(rotateStr, perm + c);
        }
    }

    // Main
    public static void main(String[] args) {
      /**
       * Testcases:
       *  1. input : abb ->  abb abb bab bba bab bba
       *  2. input : ke -> ke ek
       *  3. input : "k e" -> k<space>e kn <space>ke <space>ek ek e<space>k
       *  4. space(s) with quotes -> <space(s)>
       *  5. space with no quotes: Will print err message below
       *  6. nothing : Will print err message below
       */
      
      /**
       * String[] args
       * Source : https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
       * 
       * Usage : java PermutationFun <input>
       */
      try {
        getPermutation(args[0], "");
      } catch (ArrayIndexOutOfBoundsException e) {
          System.err.println("Proper Usage is: \"java PermutationFun <input>\" -> "  + e);
      }
    }
  }
