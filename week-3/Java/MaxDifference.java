/**
*
* Description:
*  Find the maximum difference by calculating positive differences between value
*  For example, if the given input [2, 3, 10, 2, 4, 8, 1] the size is 7 and
*  the maximum difference is 8
*
*/
public class MaxDifference {

  private int maxDiff(int[] arr, int arr_size) {
    int maxDiff = -1;
    int num = arr[0];
    int difference;

    for (int i = 1; i < arr_size; i++) {
      // Check if index 0 is less then next number in array
      if (arr[i] >= num) {
        System.out.println("current number is: " +  arr[i]);
        // Get difference if num is larger then next number in array
        difference = arr[i] - num;
        System.out.println("difference is: " +  difference);
        // Check if difference is larger then maxDiff (default is -1)
        if (difference > maxDiff) {
          // Set difference to maxDiff
          maxDiff = difference;
          System.out.println("maxdiff is: " +  maxDiff);
        }
      } else {
        // num was greater then number at index 0
        num = arr[i];
        System.out.println("num is: " +  num);
      }
    }

  return maxDiff;
  }

  // Main
  public static void main(String[] args) {
    /** 
     * Testcases:
     *  1. {7, 9, 5, 6, 3, 2} -> 2
     *  2. {3, 4} -> 1
     *  3. {2, 3, 10, 2, 4, 8, 1} -> 8
     *  4. {7, 1, 2, 5} -> 4
     *  5. {7, 5, 3, 1} -> -1
     *  6. {4} -> -1
     *  7. {} -> java.lang.ArrayIndexOutOfBoundsException: 0
     */
    // MaxDifference maxDifference = new MaxDifference();
    MaxDifference md = new MaxDifference();
    int[] arr = {2, 3, 10, 2, 4, 8, 1};
    int size = arr.length;
    System.out.println("The Maximum Difference is " + md.maxDiff(arr, size));
  }
}
