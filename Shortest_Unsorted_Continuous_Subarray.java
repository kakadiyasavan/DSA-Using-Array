// LeetCode 581 Shortest Unsorted Continuous Subarray
// Given an integer array nums, you need to find one continuous subarray such that if you only sort this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.

// Return the shortest such subarray and output its length.

// Example 1:

// Input: nums = [2,6,4,8,10,9,15]
// Output: 5
// Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 0
// Example 3:

// Input: nums = [1]
// Output: 0

import java.util.*;

public class Shortest_Unsorted_Continuous_Subarray {

     public static void Unsorted_SubArray(int[] nums,int size){

          int start = -1,end = -1;
          
          for(int i=0 ; i<size-1 ; i++){
               if(nums[i] > nums[i+1]){
                    start = i;
                    break;
               }
          }

          if(start == -1){
               System.out.println("All Array Are Soerted Not Found Unsorted SubArray");
               return;
          }

          for(int i=size-1 ; i>0 ; i--){
               if(nums[i] < nums[i-1]){
                    end = i;
                    break;
               }
          }

          System.out.println("Unsorted Sub Array Size is : " + ((end-start)+1));
     }
     
     public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Numbers In Array And Find Unsorted Sub Array : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          Unsorted_SubArray(nums, size);
     }
}
