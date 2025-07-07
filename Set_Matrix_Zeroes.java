// leetCode 73 Set Matrix Zeroes
// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.

// Example 1:

// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]
// Example 2:

// Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
// Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

import java.util.*;

public class Set_Matrix_Zeroes {

     public static void setZero(int[][] matrix,int row, int col) {

        boolean firstRow = false;
        boolean firstCol = false;

        for(int i=0 ; i<row ; i++){
          if(matrix[i][0] == 0){
               firstRow = true;
               break;
          }
        }

        for(int j=0 ; j<col ; j++){
          if(matrix[0][j] == 0){
               firstCol = true;
               break;
          }
        }

        for(int i=1 ; i<row ; i++){
          for(int j=1 ; j<col ; j++){
               if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
               }
          }
        }

        for(int i=1 ; i<row ; i++){
          for(int j=0 ; j<col ; j++){
               if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
               }
          }
        }

        if(firstRow){
          for(int i=0 ; i<row ; i++){
               matrix[i][0] = 0;
          }
        }

        if(firstCol){
          for(int i=0 ; i<col ; i++){
               matrix[0][i] = 0;
          }
        }

        System.out.println("Set Zero In Matrix : ");
        for(int i=0 ; i<row ; i++){
          for(int j=0 ; j<col ; j++){
               System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
        }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Row Number : ");
          int row = sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Column Number : ");
          int column = sc.nextInt();
          sc.nextLine();

          int[][] matrix = new int[row][column];

          System.out.println("Enter Matrix Number : ");
          for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                    System.out.print(" Enter Row : " + (i + 1) + " Column : " + (j + 1) + " Number : ");
                    matrix[i][j] = sc.nextInt();
               }
          }

          setZero(matrix,row, column);
     }
}
