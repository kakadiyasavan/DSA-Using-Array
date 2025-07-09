// leetCode 560 Subarray Sum Equals K
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2

import java.util.*;

public class Subarray_Sum_Equals_K {

     // More Optimal Apprach
     public static void Optimal_SubArray(int[] nums,int size,int target){

          int maxSubArray  = 0;
          int currentSum = 0;
          HashMap<Integer,Integer> map = new HashMap<>();

          map.put(0, 1);

          for(int i=1 ; i<size ; i++){
               currentSum += nums[i];

               int remaining = currentSum - target;

               if(map.containsKey(remaining)){
                    maxSubArray += map.get(remaining);
               }

               map.put(currentSum, map.getOrDefault(currentSum, 0)+1);
          }
          System.out.println("Optimal -> Maximum Sub Array of Target: " + maxSubArray);
     }

     // Time Complix. :- O(n2)
     public static void Calculate_SubArray(int[] nums,int size,int target){

          int maxSubArray = 0;

          for(int i=0 ; i<size ; i++){

               int sum = 0;

               for(int j=i ; j<size ; j++){
                    sum += nums[j]; 
                    if(sum == target) maxSubArray++;
               }
          }

          System.out.println("Maximum Sub Array of Target : " + maxSubArray);
     }
     
     public static void main(String[] args){
          
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] nums = new int[size];

          System.out.println("Enter Array Numbers : ");
          for(int i=0 ; i<size ; i++){
               nums[i] = sc.nextInt();
          }

          System.out.println("Enter Target Sum of Sub Array : ");
          int target = sc.nextInt();
          sc.nextLine();

          Calculate_SubArray(nums,size,target);
          Optimal_SubArray(nums,size,target);
     }
}




