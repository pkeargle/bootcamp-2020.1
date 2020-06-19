/**
 * 
 * Description:
 *  Find the maximum difference by calculating positive differences between value
 *  For example, if the given input [2, 3, 10, 2, 4, 8, 1], the size is 8 and
 *  the maximum difference is 8
 *
 */
import java.util.ArrayList;
import java.util.List;

public class StudentMaxDiff {
    
  public static int MaxDiff(int[] arr) {
    int result = -1;
    int currMin = arr[0];
    int diff;
    for(int i = 1; i < arr.length; i++) {
      if (arr[i] <= currMin) {
        currMin = arr[i];
      } else {
        diff = arr[i] - currMin;
        if (diff > result) {
          result = diff;
        }
      }
    }
    return result;
    }

  public static int MaxDifference(List <Integer> list) {
    int result = -1;
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i + 1) > list.get(i)) {
        int j = i;
        while (j >= 0) {
          result = Math.max(result, list.get(i + 1) - list.get(j));
          j--;
        }
      }
    }
    return result;
  }

   // Main
  public static void main(String[] args) {
    /**
     * MaxDiff using int array
     */
    int[] arr = {2, 3, 10, 2, 4, 8, 1};
    System.out.println("The Maximum Difference using \"MaxDiff method (array)\" is: " + MaxDiff(arr));

    /**
     * MaxDifference using list
     */
    int[] arrList = {2, 3, 10, 2, 4, 8, 1};
    List <Integer> list = new ArrayList<>();
    for (int i = 0; i < arrList.length; i++) {
      list.add(arrList[i]);
    }
    System.out.println("The Maximum Difference using \"MaxDifference method (list)\" is: " + MaxDifference(list));
    }
}