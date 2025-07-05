// leetCode 56 : Merge Intervals
// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

import java.util.*;

public class Merge_Intervals {

     public static int[][] merge(int[][] arr){

          Arrays.sort(arr,(a,b) -> Integer.compare(a[0], b[0]));

          ArrayList<int[]> merged  = new ArrayList<>();

          for(int[] interval : arr){

               if(merged.isEmpty() || interval[0] > merged.get(merged.size()-1)[1]){
                    merged.add(interval);
               } else {
                    merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
               }
          }

          return merged.toArray(new int[merged.size()][]);
     }

    public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[][] arr = new int[size][2];

          for(int i=0 ; i<size ; i++){
               for(int j=0 ; j<2 ; j++){
                    System.out.print("Enter Row " + (i+1) + " Column " + (j+1) + " : ");
                    arr[i][j] = sc.nextInt();
               }
          }

          System.out.println("Merged Intervals : " + Arrays.deepToString(merge(arr)));
    }
}