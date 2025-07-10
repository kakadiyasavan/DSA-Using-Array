// leetCode 442 Find All Duplicates in an Array
// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1,2]
// Output: [1]
// Example 3:

// Input: nums = [1]
// Output: []

import java.util.*;

public class Find_All_Duplicates_in_an_Array {

     public static void Find_Duplicate(int[] nums,int size){

          Set<Integer> set = new HashSet<>();
          Set<Integer> repet = new HashSet<>();

          for(int i=0 ; i<size ; i++){
               if(set.contains(nums[i])){
                    repet.add(nums[i]);
               } else {
                    set.add(nums[i]);
               }
          }

          System.out.println("Repeted Value is : " + repet);
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

          Find_Duplicate(nums,size);
     }
}
