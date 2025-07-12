// LeetCode 136 Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:

// Input: nums = [2,2,1]
// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4

// Example 3:

// Input: nums = [1]
// Output: 1

import java.util.Scanner;

public class Single_Number {

     public static void Find_Single(int[] nums,int size){

          int single_value = 0;

          for(int i=0 ; i<size ; i++){
               single_value = single_value ^ nums[i];
          }

          System.out.println("single Number is : " + single_value);
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Array Number : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          Find_Single(nums,size);
     }
}
