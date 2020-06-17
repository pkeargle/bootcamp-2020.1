/**
*
* Description:
*  Find the maximum difference by calculating positive differences between value
*  For example, if the given input [2, 6, 8, 5, 10, 1, 3, 4], the size is 8 and
*  the maximum difference is 9
*
*/
public class MaxDifference {

  public int maxDiff(int arr[], int arr_size) {
    int max = arr[0];
    int min = arr[0];
    int i;

    // Check length of Array and return -1 if invalid
    if (arr_size <= 1) {
      return -1;
    }

    for (i = 1; i < arr_size; i++) {
      // Check if each index in the array is less than min
      if (arr[i] < min)
          min = arr[i];
      // Check if each index in the array is greater then max
      if (arr[i] > max)
          max = arr[i];
      }

    return max-min;
    }

  // Main
  public static void main(String[] args) {
    /** 
     * Testcases:
     *  1. {1, 1, 1, 1} -> 0
     *  2. {3, 4} -> 1
     *  3. {2, 3, 10, 2, 4, 8, 1} -> 9
     *  4. {7, 9, 5, 6, 3, 2} -> 2
     *  5. {2} -> -1
     */
    MaxDifference maxDifference = new MaxDifference();
    int arr[] = {1, 1, 1, 1};
    int size = arr.length;
    System.out.println("The Maximum Difference is " + maxDifference.maxDiff(arr, size));
  }
}
