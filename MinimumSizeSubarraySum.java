// leetCode 209 Minimum Size Subarray Sum
// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0

import java.util.*;

public class MinimumSizeSubarraySum {

     public static void FindTarget(int[] arr, int target) {

          int start = 0;
          int sum = 0;
          int minLen = Integer.MAX_VALUE;

          for (int end = 0; end < arr.length; end++) {
               sum += arr[end];

               while (sum >= target) {
                    minLen = Math.min(minLen, end - start + 1);
                    sum -= arr[start];
                    start++;
               }
          }

          if(minLen == Integer.MAX_VALUE){
               System.out.println("Target Minimum Sub Array is : " + "0");
          } else{
               System.out.println("Target Minimum Sub Array is : " + minLen);
          }
     }

     public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int size = sc.nextInt();
          sc.nextLine();

          int[] arr = new int[size];

          System.out.println("Enter Number is Array : ");
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }

          System.out.println("Enter Target Number : ");
          int target = sc.nextInt();
          sc.nextLine();

          FindTarget(arr, target);
     }
} // [2,3,1,2,4,3]
