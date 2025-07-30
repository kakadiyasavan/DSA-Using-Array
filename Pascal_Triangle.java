// leetCode 118 Pascal's Triangle
// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

import java.util.*;

public class Pascal_Triangle {

     public static void Generate(int row){

          List<List<Integer>> result = new ArrayList<>();

          if(row == 0){
               System.out.println("[]");
               return;
          }

          List<Integer> firstRow = new ArrayList<>();
          firstRow.add(1);
          result.add(firstRow);

          if(row == 1){
               System.out.println("[1]");
               return;
          }

          for(int i=1 ; i<row ; i++){

               List<Integer> prevRow = result.get(i-1);
               ArrayList<Integer> currentRow = new ArrayList<>();
               currentRow.add(1);
               for(int j=1 ; j<i ; j++){
                    currentRow.add(prevRow.get(j-1) + prevRow.get(j));
               }
               currentRow.add(1);
               result.add(currentRow);
          }

          for(List<Integer> r : result){
               System.out.println(r);
          }
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Number of Row : ");
          int row = sc.nextInt();
          sc.nextLine();

          Generate(row);
     }
}
