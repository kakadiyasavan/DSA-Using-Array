// leetCode 120 Triangle
// Given a triangle array, return the minimum path sum from top to bottom.
// For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

// Example 1:

// Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
// Output: 11
// Explanation: The triangle looks like:
//    2
//   3 4
//  6 5 7
// 4 1 8 3
// The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
// Example 2:

// Input: triangle = [[-10]]
// Output: -10

import java.util.*;

public class Triangle {

     public static int minimumTotal(List<List<Integer>> triangle){
          int n = triangle.size();

          for(int i=n-2 ; i>=0 ; i--){
               List<Integer> currRow = triangle.get(i);
               List<Integer> belowRow = triangle.get(i+1);

               for(int j=0 ; j<currRow.size() ; j++){
                    int updatedVal = currRow.get(j) + Math.min(belowRow.get(j),belowRow.get(j+1));
                    currRow.set(j, updatedVal);
               }
          }
          return triangle.get(0).get(0);
     }
   
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Row Number : ");
          int n = sc.nextInt();
          List<List<Integer>> triangle = new ArrayList<>();

          System.out.println("Enter Triangle row by row : ");
          for(int i=0 ; i<n ; i++){
               List<Integer> row = new ArrayList<>();
               for(int j=0 ; j<=i ; j++){
                    row.add(sc.nextInt());
               }
               triangle.add(row);
          }
         int minTotal = minimumTotal(triangle);
         System.out.println("Minimum Path sum from top to bottom : " + minTotal);
     }
}
